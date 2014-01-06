package com.github.liosha2007.groupdocs.common;

import org.apache.http.HeaderElement;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;

public class FileStream {

    private InputStream inputStream;
    private String contentType;
    private String fileName;
    private long size = -1;


    public FileStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public FileStream(String requestUri, HttpResponse httpResponse) throws Exception {
        HttpEntity httpEntity = httpResponse.getEntity();
        this.inputStream = new BufferedInputStream(httpEntity.getContent());
        if (httpEntity.getContentType() != null) {
            this.contentType = httpEntity.getContentType().toString();
        }

        HeaderElement[] headerElements = httpResponse.getFirstHeader("Content-Disposition").getElements();
        if (headerElements.length > 0) {
            HeaderElement headerElement = headerElements[0];
            if (headerElement.getName().equalsIgnoreCase("attachment")) {
                NameValuePair nameValuePair = headerElement.getParameterByName("filename");
                fileName = (nameValuePair != null) ? nameValuePair.getValue() : getFileNameFromUrl(requestUri);
                size = httpResponse.getEntity().getContentLength();
            }
        }
    }

    private String getFileNameFromUrl(String requestUri) throws Exception {
        URL url = new URL(requestUri);
        String path = url.getPath();
        return path.substring(path.lastIndexOf('/') + 1);
    }

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

}
