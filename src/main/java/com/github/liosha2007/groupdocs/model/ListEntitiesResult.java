package com.github.liosha2007.groupdocs.model;

import java.util.ArrayList;
import java.util.List;

public class ListEntitiesResult {
    private String path = null;
    private Integer count = null;
    private List<FileSystemFolder> folders = new ArrayList<FileSystemFolder>();
    private List<FileSystemDocument> files = new ArrayList<FileSystemDocument>();

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<FileSystemFolder> getFolders() {
        return folders;
    }

    public void setFolders(List<FileSystemFolder> folders) {
        this.folders = folders;
    }

    public List<FileSystemDocument> getFiles() {
        return files;
    }

    public void setFiles(List<FileSystemDocument> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ListEntitiesResult that = (ListEntitiesResult) o;

        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (files != null ? !files.equals(that.files) : that.files != null) return false;
        if (folders != null ? !folders.equals(that.folders) : that.folders != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = path != null ? path.hashCode() : 0;
        result = 31 * result + (count != null ? count.hashCode() : 0);
        result = 31 * result + (folders != null ? folders.hashCode() : 0);
        result = 31 * result + (files != null ? files.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "ListEntitiesResult{" +
                "path='" + path + '\'' +
                ", count=" + count +
                ", folders=" + folders +
                ", files=" + files +
                '}';
    }
}

