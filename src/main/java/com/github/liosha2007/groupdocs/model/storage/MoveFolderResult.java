package com.github.liosha2007.groupdocs.model.storage;

public class MoveFolderResult {
    private String from_path = null;
    private String to_path = null;

    public String getFrom_path() {
        return from_path;
    }

    public void setFrom_path(String from_path) {
        this.from_path = from_path;
    }

    public String getTo_path() {
        return to_path;
    }

    public void setTo_path(String to_path) {
        this.to_path = to_path;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MoveFolderResult that = (MoveFolderResult) o;

        if (from_path != null ? !from_path.equals(that.from_path) : that.from_path != null) return false;
        if (to_path != null ? !to_path.equals(that.to_path) : that.to_path != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = from_path != null ? from_path.hashCode() : 0;
        result = 31 * result + (to_path != null ? to_path.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MoveFolderResult");
        sb.append("{from_path='").append(from_path).append('\'');
        sb.append(", to_path='").append(to_path).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

