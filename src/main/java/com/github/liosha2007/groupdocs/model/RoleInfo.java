package com.github.liosha2007.groupdocs.model;

public class RoleInfo {
    private Double id = null;
    private String name = null;

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RoleInfo roleInfo = (RoleInfo) o;

        if (id != null ? !id.equals(roleInfo.id) : roleInfo.id != null) return false;
        if (name != null ? !name.equals(roleInfo.name) : roleInfo.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "RoleInfo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
