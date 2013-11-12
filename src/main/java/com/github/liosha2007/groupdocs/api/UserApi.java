package com.github.liosha2007.groupdocs.api;

import com.github.liosha2007.groupdocs.common.ApiClient;
import com.github.liosha2007.groupdocs.common.ApiException;
import com.github.liosha2007.groupdocs.model.common.UserInfo;
import com.github.liosha2007.groupdocs.model.user.UpdateUserResponse;
import com.github.liosha2007.groupdocs.model.user.UserInfoResponse;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: liosha
 * Date: 12.11.13
 * Time: 13:47
 */
public class UserApi {
    protected ApiClient apiClient = null;

    public UserApi() {

    }

    public UserApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * /shared/users/{userName}/logins
     *
     * @param userName
     * @param password
     * @return
     * @throws Exception
     */
    public UserInfoResponse loginUser(String userName, String password) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (userName == null || password == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/shared/users/{userName}/logins";
        // create path and map variables
        resourcePath = resourcePath.replace("{userName}", userName);
        String response = apiClient.invokeAPI(resourcePath, "POST", new HashMap<String, String>(), password, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (UserInfoResponse) ApiClient.deserealize(response, UserInfoResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /mgmt/{userId}/profile
     *
     * @return
     * @throws Exception
     */
    public UserInfoResponse loadUserProfile() throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        String resourcePath = "/mgmt/{userId}/profile";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid());
        String response = apiClient.invokeAPI(resourcePath, "GET", new HashMap<String, String>(), null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (UserInfoResponse) ApiClient.deserealize(response, UserInfoResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /mgmt/{userId}/profile
     *
     * @param userInfo
     * @return
     * @throws Exception
     */
    public UpdateUserResponse updateUserProfile(UserInfo userInfo) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (userInfo == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/mgmt/{userId}/profile";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid());
        String response = apiClient.invokeAPI(resourcePath, "PUT", new HashMap<String, String>(), userInfo, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (UpdateUserResponse) ApiClient.deserealize(response, UpdateUserResponse.class);
        } else {
            return null;
        }
    }
}
