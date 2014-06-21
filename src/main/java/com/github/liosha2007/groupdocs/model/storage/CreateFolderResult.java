package com.github.liosha2007.groupdocs.model.storage;

import java.io.Serializable;

public class CreateFolderResult implements Serializable {
    private Double id = null;
    private String path = null;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CreateFolderResult that = (CreateFolderResult) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (path != null ? !path.equals(that.path) : that.path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (path != null ? path.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CreateFolderResult");
        sb.append("{id=").append(id);
        sb.append(", path='").append(path).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

