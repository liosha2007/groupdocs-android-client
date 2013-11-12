package com.github.liosha2007.groupdocs.model.common;

public class Dimension {
    private Integer width = null;
    private Integer height = null;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dimension dimension = (Dimension) o;

        if (height != null ? !height.equals(dimension.height) : dimension.height != null) return false;
        if (width != null ? !width.equals(dimension.width) : dimension.width != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = width != null ? width.hashCode() : 0;
        result = 31 * result + (height != null ? height.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Dimension");
        sb.append("{width=").append(width);
        sb.append(", height=").append(height);
        sb.append('}');
        return sb.toString();
    }
}

