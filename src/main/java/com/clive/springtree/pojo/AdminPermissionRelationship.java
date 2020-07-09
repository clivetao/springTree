package com.clive.springtree.pojo;
/**
 *用户和权限的关系类
 * created by clive tao on 2020 7/8
 */
public class AdminPermissionRelationship {
    private int id;
    private int aid;
    private int pid;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
