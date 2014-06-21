package com.github.liosha2007.groupdocs.model.document;

import java.io.Serializable;

public class ViewDocumentResponse implements Serializable {
    private ViewDocumentResult result = null;
    private String status = null;
    private String error_message = null;
    private Long composedOn = null;

    public ViewDocumentResult getResult() {
        return result;
    }

    public void setResult(ViewDocumentResult result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getError_message() {
        return error_message;
    }

    public void setError_message(String error_message) {
        this.error_message = error_message;
    }

    public Long getComposedOn() {
        return composedOn;
    }

    public void setComposedOn(Long composedOn) {
        this.composedOn = composedOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ViewDocumentResponse that = (ViewDocumentResponse) o;

        if (composedOn != null ? !composedOn.equals(that.composedOn) : that.composedOn != null) return false;
        if (error_message != null ? !error_message.equals(that.error_message) : that.error_message != null)
            return false;
        if (result != null ? !result.equals(that.result) : that.result != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result1 = result != null ? result.hashCode() : 0;
        result1 = 31 * result1 + (status != null ? status.hashCode() : 0);
        result1 = 31 * result1 + (error_message != null ? error_message.hashCode() : 0);
        result1 = 31 * result1 + (composedOn != null ? composedOn.hashCode() : 0);
        return result1;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ViewDocumentResponse");
        sb.append("{result=").append(result);
        sb.append(", status='").append(status).append('\'');
        sb.append(", error_message='").append(error_message).append('\'');
        sb.append(", composedOn=").append(composedOn);
        sb.append('}');
        return sb.toString();
    }
}

