package com.github.liosha2007.groupdocs.common;


import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.*;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 07.11.13
 * Time: 20:52
 */
public class ApiClient {
    private static final String ENC = "UTF-8";
    private static final String SIGN_ALG = "HmacSHA1";

    private String cid = null;
    private String pkey = null;
    private String bpath = "https://api.groupdocs.com/v2.0";
    private Map<String, String> defaultHeaderMap = new HashMap<String, String>();

    public ApiClient() {

    }

    public ApiClient(String pkey) {
        this.pkey = pkey;
    }

    public ApiClient(String pkey, String cid) {
        this.pkey = pkey;
        this.cid = cid;
    }

    public ApiClient(String pkey, String cid, String bpath) {
        this.pkey = pkey;
        this.cid = cid;
        this.bpath = bpath;
    }

    public static String sign(String pkey, String toSign) throws Exception {
        Mac mac = Mac.getInstance(SIGN_ALG);
        mac.init(new SecretKeySpec(pkey.getBytes(ENC), SIGN_ALG));
        org.apache.commons.codec.binary.Base64 base64 = new org.apache.commons.codec.binary.Base64();
        String signature = new String(base64.encode(mac.doFinal(toSign.getBytes(ENC))));
        if (signature.endsWith("=")) {
            signature = signature.substring(0, signature.length() - 1);
        }
        return signature;
    }

    public static String signUrl(String pkey, String url) throws Exception {
        if ("".equals(pkey)) {
            return url;
        }
        StringBuilder temp = new StringBuilder(url);
        URL resourceURL = new URL(url);
        String pathAndQuery = resourceURL.getFile();
        if (url.lastIndexOf(" ") == url.length() - 1) {
            pathAndQuery = pathAndQuery + " ";
        }
        String signature = sign(pkey, encodeURI(pathAndQuery));
        temp.append((resourceURL.getQuery() == null ? "?" : "&")).append("signature=").append(encodeURIComponent(signature));
        return temp.toString();
    }

    public static String encodeURI(String uri) throws Exception {
        return encodeURIComponent(uri)
                .replace("%3B", ";")
                .replace("%2C", ",")
                .replace("%2F", "/")
                .replace("%3F", "?")
                .replace("%3A", ":")
                .replace("%40", "@")
                .replace("%26", "&")
                .replace("%3D", "=")
//                .replace("%2B", "+")
                .replace("%24", "$")
                .replace("%25", "%")
                .replace("%23", "#");
    }

    public static String encodeURIComponent(String str) throws Exception {
        return URLEncoder.encode(str, ENC)
                .replace("+", "%20")
                .replace("%21", "!")
                .replace("%27", "'")
                .replace("%28", "(")
                .replace("%29", ")")
                .replace("%7E", "~");
    }

    public String escapeString(String str) throws Exception {
        return encodeURIComponent(str);
    }

    public String getCid() {
        return this.cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public void setPkey(String pkey) {
        this.pkey = pkey;
    }

    public String getBpath() {
        return bpath;
    }

    public void setBpath(String bpath) {
        this.bpath = bpath;
    }

    public <T> T invokeAPI(String path, String method, Map<String, String> queryParams, Object body, Map<String, String> headerParams, Class<T> returnType) throws Exception {
        StringBuilder stringBuilder = new StringBuilder();

        for (String key : queryParams.keySet()) {
            String value = queryParams.get(key);
            if (value != null) {
                if (stringBuilder.toString().length() == 0) {
                    stringBuilder.append("?");
                } else {
                    stringBuilder.append("&");
                }
                stringBuilder.append(escapeString(key)).append("=").append(escapeString(value));
            }
        }
        String queryString = stringBuilder.toString();

        HttpClient httpClient = new DefaultHttpClient();

        boolean isFileUpload = body instanceof FileStream;

        String requestUri = encodeURI(ApiClient.signUrl(pkey, bpath + path + queryString)); // Redirect not worked

        HttpRequestBase httpRequest = null;
        if ("GET".equals(method)) {
            httpRequest = new HttpGet();
        } else if ("POST".equals(method)) {
            httpRequest = new HttpPost();
            if (isFileUpload) {
                InputStream inputStream = ((FileStream) body).getInputStream();
                ((HttpPost) httpRequest).setEntity(new InputStreamEntity(inputStream, inputStream.available()));
            } else {
                if (body != null){
                    ((HttpPost) httpRequest).setEntity(new StringEntity(serealize(body)));
                }
            }
        } else if ("PUT".equals(method)) {
            httpRequest = new HttpPut();
            if (isFileUpload) {
                InputStream inputStream = ((FileStream) body).getInputStream();
                ((HttpPut) httpRequest).setEntity(new InputStreamEntity(inputStream, inputStream.available()));
            } else {
                ((HttpPut) httpRequest).setEntity(new StringEntity(serealize(body)));
            }
        } else if ("DELETE".equals(method)) {
            httpRequest = new HttpDelete();
        } else {
            throw new ApiException("Unknown HTTP method '" + method + "'");
        }

        for (String key : defaultHeaderMap.keySet()) {
            httpRequest.setHeader(key, defaultHeaderMap.get(key));
        }

        for (String key : headerParams.keySet()) {
            httpRequest.setHeader(key, headerParams.get(key));
        }

        if (body == null) {
            httpRequest.setHeader(HTTP.CONTENT_TYPE, "text/html");
        } else if (body instanceof FileStream) {
            httpRequest.setHeader(HTTP.CONTENT_TYPE, "application/octet-stream");
        } else {
            httpRequest.setHeader(HTTP.CONTENT_TYPE, "application/json");
        }

        T toReturn = null;
        httpRequest.setURI(new URI(requestUri));
        HttpResponse httpResponse = httpClient.execute(httpRequest);
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        if (statusCode == HttpStatus.SC_OK || statusCode == HttpStatus.SC_CREATED || statusCode == HttpStatus.SC_ACCEPTED) {
            if (FileStream.class.equals(returnType)) {
                if (httpResponse.getFirstHeader("Transfer-Encoding") != null || httpResponse.getEntity().getContentLength() > 0) {
                    toReturn = (T) new FileStream(requestUri, httpResponse);
                } else {
                    toReturn = null;
                }
            } else {
                toReturn = (T) EntityUtils.toString(httpResponse.getEntity());
            }
        } else {
            String errMsg = EntityUtils.toString(httpResponse.getEntity());
            if ("".equals(errMsg)) {
                errMsg = "Code: " + Integer.toString(httpResponse.getStatusLine().getStatusCode()) + ", Cause: " + httpResponse.getStatusLine().getReasonPhrase();
            }
            try {
                JSONObject jsonObject = new JSONObject(errMsg);
                if (jsonObject.has("error_message")) {
                    errMsg = jsonObject.getString("error_message");
                }
            } finally {
                throw new Exception(errMsg);
            }
        }
        return toReturn;
    }

    public static String serealize(Object object) {
        Gson gson = new Gson();
        return gson.toJson(object);
    }

    public static <T> T deserealize(String json, Class clazz) {
        Gson gson = new Gson();
        return (T) gson.fromJson(json, clazz);
    }

    public Map<String, String> getDefaultHeaderMap() {
        return defaultHeaderMap;
    }

    public void setDefaultHeaderMap(Map<String, String> defaultHeaderMap) {
        this.defaultHeaderMap = defaultHeaderMap;
    }
}

