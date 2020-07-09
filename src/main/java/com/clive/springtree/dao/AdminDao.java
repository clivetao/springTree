package com.clive.springtree.dao;

import com.clive.springtree.pojo.Admin;
import org.springframework.stereotype.Component;


import java.util.List;
/**
 *用户类
 * created by clive tao on 2020 7/8
 */
@Component
public interface AdminDao {
    //查询所有的用户
    List<Admin> getAllAdminList();

    //新用户注册
    int insertAdmin(Admin admin);

    //删除用户
    int deleteAdmin(int id);

    //根据姓名查询用户
    List<Admin> getAdmin(String name);
}
