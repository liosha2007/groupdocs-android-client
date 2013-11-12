package com.github.liosha2007.groupdocs.api;

import com.github.liosha2007.groupdocs.common.ApiClient;
import com.github.liosha2007.groupdocs.common.ApiException;
import com.github.liosha2007.groupdocs.model.storage.*;

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

    public ListEntitiesResponse listEntities(String path) throws Exception {
        return listEntities(path, null, null, null, null, null, null, null);
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
     * @throws Exception
     */
    public ListEntitiesResponse listEntities(String path, Integer pageIndex, Integer pageSize, String orderBy, Boolean orderAsc, String filter, String fileTypes, Boolean extended) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (path == null) {
            throw new ApiException("Missing required params!");
        }
        String resourcePath = "/storage/{userId}/folders/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", path);
        // query params
        Map<String, String> queryParams = new HashMap<String, String>();

        if (pageIndex != null) {
            queryParams.put("page", String.valueOf(pageIndex));
        }
        if (pageSize != null) {
            queryParams.put("count", String.valueOf(pageSize));
        }
        if (orderBy != null) {
            queryParams.put("order_by", orderBy);
        }
        if (orderAsc != null) {
            queryParams.put("order_asc", String.valueOf(orderAsc));
        }
        if (filter != null) {
            queryParams.put("filter", String.valueOf(filter));
        }
        if (fileTypes != null) {
            queryParams.put("file_types", String.valueOf(fileTypes));
        }
        if (extended != null) {
            queryParams.put("extended", String.valueOf(extended));
        }
        String response = apiClient.invokeAPI(resourcePath, "GET", queryParams, null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (ListEntitiesResponse) ApiClient.deserealize(response, ListEntitiesResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/urls?url={url}
     *
     * @param url
     * @return
     * @throws Exception
     */
    public UploadWebResponse uploadWeb(final String url) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (url == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/urls";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid());
        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        queryParams.put("url", url);
        String response = apiClient.invokeAPI(resourcePath, "POST", queryParams, null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (UploadWebResponse) ApiClient.deserealize(response, UploadWebResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/files/{fileId}
     *
     * @param fileId
     * @return
     * @throws Exception
     */
    public DeleteResponse delete(String fileId) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (fileId == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/files/{fileId}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{fileId}", fileId);
        // query params
        Map<String, String> queryParams = new HashMap<String, String>();
        String response = apiClient.invokeAPI(resourcePath, "DELETE", queryParams, null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (DeleteResponse) ApiClient.deserealize(response, DeleteResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/files/{path}
     *
     * @param toPath
     * @param fileId
     * @return
     * @throws Exception
     */
    public MoveFileResponse moveFile(String toPath, Double fileId) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (toPath == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/files/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", toPath);
        // query params
        Map<String, String> headerParams = new HashMap<String, String>();
//        queryParams.put("mode", String.valueOf(mode));
        headerParams.put("Groupdocs-Copy", null);
        headerParams.put("Groupdocs-Move", Double.toString(fileId));
        String response = apiClient.invokeAPI(resourcePath, "PUT", new HashMap<String, String>(), null, headerParams, String.class);
        if (response != null) {
            return (MoveFileResponse) ApiClient.deserealize(response, MoveFileResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/files/{path}
     *
     * @param toPath
     * @param fileId
     * @return
     * @throws Exception
     */
    public MoveFileResponse copyFile(String toPath, Double fileId) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (toPath == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/files/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", toPath);
        // query params
        Map<String, String> headerParams = new HashMap<String, String>();
//        queryParams.put("mode", String.valueOf(mode));
        headerParams.put("Groupdocs-Copy", Double.toString(fileId));
        headerParams.put("Groupdocs-Move", null);
        String response = apiClient.invokeAPI(resourcePath, "PUT", new HashMap<String, String>(), null, headerParams, String.class);
        if (response != null) {
            return (MoveFileResponse) ApiClient.deserealize(response, MoveFileResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/folders/{path}?override_mode={mode}
     *
     * @param toPath
     * @param folderId
     * @return
     * @throws Exception
     */
    public MoveFolderResponse moveFolder(String toPath, Double folderId) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (toPath == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/folders/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", toPath);
        // query params
        Map<String, String> headerParams = new HashMap<String, String>();
//        queryParams.put("override_mode", null);
        headerParams.put("Groupdocs-Move", Double.toString(folderId));
        headerParams.put("Groupdocs-Copy", null);
        String response = apiClient.invokeAPI(resourcePath, "PUT", new HashMap<String, String>(), null, headerParams, String.class);
        if (response != null) {
            return (MoveFolderResponse) ApiClient.deserealize(response, MoveFolderResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/folders/{path}?override_mode={mode}
     *
     * @param toPath
     * @param folderId
     * @return
     * @throws Exception
     */
    public MoveFolderResponse copyFolder(String toPath, Double folderId) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (toPath == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/folders/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", toPath);
        // query params
        Map<String, String> headerParams = new HashMap<String, String>();
//        queryParams.put("override_mode", null);
        headerParams.put("Groupdocs-Move", null);
        headerParams.put("Groupdocs-Copy", Double.toString(folderId));
        String response = apiClient.invokeAPI(resourcePath, "PUT", new HashMap<String, String>(), null, headerParams, String.class);
        if (response != null) {
            return (MoveFolderResponse) ApiClient.deserealize(response, MoveFolderResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/paths/{path}
     *
     * @param path
     * @return
     * @throws Exception
     */
    public CreateFolderResponse createFolder(String path) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (path == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/paths/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", path);
        String response = apiClient.invokeAPI(resourcePath, "POST", new HashMap<String, String>(), null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (CreateFolderResponse) ApiClient.deserealize(response, CreateFolderResponse.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/trash/{path}
     *
     * @param path
     * @return
     * @throws Exception
     */
    public DeleteToTrashResult deleteToTrash(String path) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (path == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/trash/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", path);
        String response = apiClient.invokeAPI(resourcePath, "PUT", new HashMap<String, String>(), null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (DeleteToTrashResult) ApiClient.deserealize(response, DeleteToTrashResult.class);
        } else {
            return null;
        }
    }

    /**
     * /storage/{userId}/trash/{path}
     *
     * @param path
     * @return
     * @throws Exception
     */
    public RestoreFromTrashResponse restoreFromTrash(String path) throws Exception {
        if (apiClient == null || apiClient.getCid() == null) {
            throw new ApiException("apiClient or cid is null");
        }
        if (path == null) {
            throw new ApiException("missing required params");
        }
        String resourcePath = "/storage/{userId}/trash/{path}";
        // create path and map variables
        resourcePath = resourcePath.replace("{userId}", apiClient.getCid()).replace("{path}", path);
        String response = apiClient.invokeAPI(resourcePath, "DELETE", new HashMap<String, String>(), null, new HashMap<String, String>(), String.class);
        if (response != null) {
            return (RestoreFromTrashResponse) ApiClient.deserealize(response, RestoreFromTrashResponse.class);
        } else {
            return null;
        }
    }
}
