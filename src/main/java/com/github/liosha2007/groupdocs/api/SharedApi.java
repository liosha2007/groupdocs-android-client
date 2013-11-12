package com.github.liosha2007.groupdocs.api;

import com.github.liosha2007.groupdocs.common.ApiClient;
import com.github.liosha2007.groupdocs.common.ApiException;
import com.github.liosha2007.groupdocs.model.shared.LoadSharedDocumentsResponse;
import com.github.liosha2007.groupdocs.model.shared.ShareDocumentResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 12.11.13
 * Time: 13:45
 */
public class SharedApi {
    protected ApiClient apiClient = null;

    public SharedApi() {

    }

    public SharedApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * /doc/{userId}/files/{fileId}/sharers
     *
     * @param fileId
     * @param stringList
     * @return
     * @throws Exception
     */
    public ShareDocumentResponse shareDocument(String fileId, List<String> stringList) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (fileId == null || stringList == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/doc/{userId}/files/{fileId}/sharers";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{fileId}", fileId);
        String response = apiClient.invokeAPI(resourcePath, "PUT", new HashMap<String, String>(), stringList, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (ShareDocumentResponse) ApiClient.deserealize(response, ShareDocumentResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /doc/{userId}/files/{fileId}/sharers
     *
     * @param fileId
     * @return
     * @throws Exception
     */
    public ShareDocumentResponse unShareDocument(String fileId) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (fileId == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/doc/{userId}/files/{fileId}/sharers";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{fileId}", fileId);
        String response = apiClient.invokeAPI(resourcePath, "DELETE", new HashMap<String, String>(), null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (ShareDocumentResponse) ApiClient.deserealize(response, ShareDocumentResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /doc/{userId}/shares/{sharesTypes}?page_index={pageIndex}&page_size={pageSize}&order_by={orderBy}&order_asc={orderAsc}
     *
     * @param sharesTypes
     * @return
     * @throws Exception
     */
    public LoadSharedDocumentsResponse loadSharedDocuments(String sharesTypes) throws Exception {
        return loadSharedDocuments(sharesTypes, null, null, null, null);
    }

    /**
     * /doc/{userId}/shares/{sharesTypes}?page_index={pageIndex}&page_size={pageSize}&order_by={orderBy}&order_asc={orderAsc}
     *
     * @param sharesTypes
     * @param pageIndex
     * @param pageSize
     * @param orderBy
     * @param orderAsc
     * @return
     * @throws Exception
     */
    public LoadSharedDocumentsResponse loadSharedDocuments(String sharesTypes, String pageIndex, String pageSize, String orderBy, Boolean orderAsc) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (sharesTypes == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/doc/{userId}/shares/{sharesTypes}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{sharesTypes}", sharesTypes);
        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        if (pageIndex != null) {
            queryParams.put("page_index", pageIndex);
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize);
        }
        if (orderBy != null) {
            queryParams.put("order_by", orderBy);
        }
        if (orderAsc != null) {
            queryParams.put("order_asc", Boolean.toString(orderAsc));
        }
        String response = apiClient.invokeAPI(resourcePath, "GET", queryParams, null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (LoadSharedDocumentsResponse) ApiClient.deserealize(response, LoadSharedDocumentsResponse.class);
        } else {
            return null;
        }
    }
}
