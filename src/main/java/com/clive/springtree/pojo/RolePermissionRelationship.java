package com.clive.springtree.pojo;
/**
 *角色和权限关系类
 * created by clive tao on 2020 7/8
 */
public class RolePermissionRelationship {
    private int id;
    private int rid;
    private int pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }
}
