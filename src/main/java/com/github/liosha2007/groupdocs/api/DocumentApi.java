package com.github.liosha2007.groupdocs.api;

import com.github.liosha2007.groupdocs.common.ApiClient;
import com.github.liosha2007.groupdocs.common.ApiException;
import com.github.liosha2007.groupdocs.model.document.ViewDocumentResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 12.11.13
 * Time: 14:26
 */
public class DocumentApi {
    protected ApiClient apiClient = null;

    public DocumentApi() {

    }

    public DocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * /doc/{userId}/files/{fileId}/thumbnails?page_number={pageNumber}&page_count={pageCount}&width={width}&quality={quality}&use_pdf={usePdf}&passwordSalt={passwordSalt}
     *
     * @param fileId
     * @return
     * @throws Exception
     */
    public ViewDocumentResponse viewDocument(String fileId) throws Exception {
        return viewDocument(fileId, null, null, null, null, null, null);
    }

    /**
     * /doc/{userId}/files/{fileId}/thumbnails?page_number={pageNumber}&page_count={pageCount}&width={width}&quality={quality}&use_pdf={usePdf}&passwordSalt={passwordSalt}
     *
     * @param fileId
     * @param pageNumber
     * @param pageCount
     * @param width
     * @param quality
     * @param usePdf
     * @param passwordSalt
     * @return
     * @throws Exception
     */
    public ViewDocumentResponse viewDocument(String fileId, String pageNumber, String pageCount, String width, String quality, String usePdf, String passwordSalt) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (fileId == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/doc/{userId}/files/{fileId}/thumbnails";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{fileId}", fileId);
        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        if (pageNumber != null) {
            queryParams.put("page_number", pageNumber);
        }
        if (pageCount != null) {
            queryParams.put("page_count", pageCount);
        }
        if (width != null) {
            queryParams.put("width", width);
        }
        if (quality != null) {
            queryParams.put("quality", quality);
        }
        if (usePdf != null) {
            queryParams.put("use_pdf", usePdf);
        }
        if (passwordSalt != null) {
            queryParams.put("passwordSalt", passwordSalt);
        }
        String response = apiClient.invokeAPI(resourcePath, "POST", queryParams, null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (ViewDocumentResponse) ApiClient.deserealize(response, ViewDocumentResponse.class);
        } else {
            return null;
        }
    }
}
