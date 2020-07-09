package com.clive.springtree.pojo;
/**
 *用户和角色关系类
 * created by clive tao on 2020 7/8
 */
public class AdminRoleRelationship {
    private int id;
    private int aid;
    private int rid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }
}
