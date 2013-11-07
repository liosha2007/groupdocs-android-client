package com.github.liosha2007.groupdocs.api;

import com.github.liosha2007.groupdocs.common.ApiClient;
import com.github.liosha2007.groupdocs.common.ApiException;
import com.github.liosha2007.groupdocs.model.ListEntitiesResponse;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 07.11.13
 * Time: 21:35
 */
public class StorageApi {
    protected ApiClient apiClient = null;

    public StorageApi() {

    }

    public StorageApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ListEntitiesResponse ListEntities(String path) throws Exception {
        return ListEntities(path, null, null, null, null, null, null, null);
    }

    /**
     * /storage/{userId}/folders/{path}?page={pageIndex}&count={pageSize}&order_by={orderBy}&order_asc={orderAsc}&filter={filter}&file_types={fileTypes}&extended={extended}
     *
     * @param path
     * @param pageIndex
     * @param pageSize
     * @param orderBy
     * @param orderAsc
     * @param filter
     * @param fileTypes
     * @param extended
     * @return
     * @throws ApiException
     */
    public ListEntitiesResponse ListEntities(String path, Integer pageIndex, Integer pageSize, String orderBy, Boolean orderAsc, String filter, String fileTypes, Boolean extended) throws Exception {
        if (apiClient == null || apiClient.getCid() == null || path == null) {
            throw new ApiException("Missing required params!");
        }
        String resourcePath = "/storage/{userId}/folders/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", String.valueOf(apiClient.getCid())).replace("{path}", String.valueOf(path));

        // query params
        Map<String, String> queryParams = new HashMap<String, String>();

        if (!"null".equals(String.valueOf(pageIndex))) {
            queryParams.put("page", String.valueOf(pageIndex));
        }
        if (!"null".equals(String.valueOf(pageSize))) {
            queryParams.put("count", String.valueOf(pageSize));
        }
        if (!"null".equals(String.valueOf(orderBy))) {
            queryParams.put("order_by", String.valueOf(orderBy));
        }
        if (!"null".equals(String.valueOf(orderAsc))) {
            queryParams.put("order_asc", String.valueOf(orderAsc));
        }
        if (!"null".equals(String.valueOf(filter))) {
            queryParams.put("filter", String.valueOf(filter));
        }
        if (!"null".equals(String.valueOf(fileTypes))) {
            queryParams.put("file_types", String.valueOf(fileTypes));
        }
        if (!"null".equals(String.valueOf(extended))) {
            queryParams.put("extended", String.valueOf(extended));
        }
        String response = apiClient.invokeAPI(resourcePath, "GET", queryParams, null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (ListEntitiesResponse) ApiClient.deserealize(response, ListEntitiesResponse.class);
        } else {
            return null;
        }
    }
}
