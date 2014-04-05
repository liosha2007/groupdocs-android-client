package test.com.github.liosha2007.groupdocs.api;

import com.github.liosha2007.groupdocs.api.StorageApi;
import com.github.liosha2007.groupdocs.common.ApiClient;
import com.github.liosha2007.groupdocs.model.storage.ListEntitiesResponse;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * StorageApi Tester.
 *
 * @author liosha
 */
public class StorageApiTest {
    protected StorageApi storageApi;
    private String pkey = "65fbeb273446c1f61a2de813cb5b2357";
    private String cid = "1ab721efeb51dc61";
    private String bpath = "https://api.groupdocs.com/v2.0";

    @Before
    public void before() throws Exception {
        storageApi = new StorageApi(new ApiClient(pkey, cid, bpath));
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: getApiClient()
     */
    @Test
    public void testGetApiClient() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: setApiClient(ApiClient apiClient)
     */
    @Test
    public void testSetApiClient() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: listEntities(String path)
     */
    @Test
    public void testListEntitiesPath() throws Exception {
        String path = "";
        ListEntitiesResponse listEntitiesResponse = storageApi.listEntities(path);
        Assert.assertNotNull("listEntitiesResponse is null", listEntitiesResponse);
        Assert.assertNotNull("listEntitiesResponse.getResult() is null", listEntitiesResponse.getResult());

    }

    /**
     * Method: listEntities(String path, Integer pageIndex, Integer pageSize, String orderBy, Boolean orderAsc, String filter, String fileTypes, Boolean extended)
     */
    @Test
    public void testListEntitiesForPathPageIndexPageSizeOrderByOrderAscFilterFileTypesExtended() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: uploadWeb(final String url)
     */
    @Test
    public void testUploadWeb() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: delete(String fileId)
     */
    @Test
    public void testDelete() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: moveFile(String toPath, Double fileId)
     */
    @Test
    public void testMoveFile() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: copyFile(String toPath, Double fileId)
     */
    @Test
    public void testCopyFile() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: moveFolder(String toPath, Double folderId)
     */
    @Test
    public void testMoveFolder() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: copyFolder(String toPath, Double folderId)
     */
    @Test
    public void testCopyFolder() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: createFolder(String path)
     */
    @Test
    public void testCreateFolder() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: deleteToTrash(String path)
     */
    @Test
    public void testDeleteToTrash() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: restoreFromTrash(String path)
     */
    @Test
    public void testRestoreFromTrash() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: downloadFile(String guid, String fileName)
     */
    @Test
    public void testDownloadFile() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: uploadFile(String filePath, InputStream inputStream)
     */
    @Test
    public void testUploadFileForFilePathInputStream() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: uploadFile(String filePath, FileStream body)
     */
    @Test
    public void testUploadFileForFilePathBody() throws Exception {
// TODO: Test goes here... 
    }

    /**
     * Method: uploadFile(String filePath, FileStream body, String fileDescription)
     */
    @Test
    public void testUploadFileForFilePathBodyFileDescription() throws Exception {
// TODO: Test goes here... 
    }


} 
