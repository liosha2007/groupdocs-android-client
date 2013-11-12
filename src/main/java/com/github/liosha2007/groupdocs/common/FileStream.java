package com.github.liosha2007.groupdocs.common;

import org.apache.http.HttpResponse;

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

    public FileStream(String requestUri, HttpResponse httpResponse) {
        // TODO:
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
