package com.github.liosha2007.groupdocs.api;

import com.github.liosha2007.groupdocs.common.ApiClient;
import com.github.liosha2007.groupdocs.common.ApiException;
import com.github.liosha2007.groupdocs.model.async.LoadJobResponse;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 12.11.13
 * Time: 14:32
 */
public class AsyncApi {
    protected ApiClient apiClient = null;

    public AsyncApi() {

    }

    public AsyncApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * /async/{userId}/jobs/{jobId}
     *
     * @param jobId
     * @return
     * @throws Exception
     */
    public LoadJobResponse loadJob(String jobId) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (jobId == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/async/{userId}/jobs/{jobId}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{jobId}", jobId);
        String response = apiClient.invokeAPI(resourcePath, "GET", new HashMap<String, String>(), null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (LoadJobResponse) ApiClient.deserealize(response, LoadJobResponse.class);
        } else {
            return null;
        }
    }
}
