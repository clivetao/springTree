package com.clive.springtree.service;

import com.clive.springtree.common.ResultCode;
import com.clive.springtree.pojo.Admin;

import java.util.List;

public interface AdminService {
    public Admin addAdmin(Admin admin);

    public List<Admin> selectAdmin(String name);
}
