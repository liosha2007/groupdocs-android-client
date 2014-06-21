package com.github.liosha2007.groupdocs.model.shared;

import com.github.liosha2007.groupdocs.model.common.SharedDocumentInfo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class LoadSharedDocumentsResult implements Serializable {
    private Integer count = null;
    private List<SharedDocumentInfo> documents = new ArrayList<SharedDocumentInfo>();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<SharedDocumentInfo> getDocuments() {
        return documents;
    }

    public void setDocuments(List<SharedDocumentInfo> documents) {
        this.documents = documents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoadSharedDocumentsResult that = (LoadSharedDocumentsResult) o;

        if (count != null ? !count.equals(that.count) : that.count != null) return false;
        if (documents != null ? !documents.equals(that.documents) : that.documents != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = count != null ? count.hashCode() : 0;
        result = 31 * result + (documents != null ? documents.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LoadSharedDocumentsResult");
        sb.append("{count=").append(count);
        sb.append(", documents=").append(documents);
        sb.append('}');
        return sb.toString();
    }
}

