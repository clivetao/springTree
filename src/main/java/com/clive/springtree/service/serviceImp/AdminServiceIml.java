package com.clive.springtree.service.serviceImp;


import com.clive.springtree.common.ResultCode;
import com.clive.springtree.dao.AdminDao;
import com.clive.springtree.pojo.Admin;
import com.clive.springtree.service.AdminService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceIml implements AdminService {
    private static final Logger admin_log = LoggerFactory.getLogger(AdminServiceIml.class);
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin addAdmin(Admin admin) {
        String userName = admin.getUserName();
        List<Admin> isOldAdmin = selectAdmin(userName);
        if (isOldAdmin.size()>0){
            admin_log.info(ResultCode.VALIDATE_FAILED.getMessage(),ResultCode.VALIDATE_FAILED.getCode());
            return null;
        }
        int id = adminDao.insertAdmin(admin);
        return admin;
    }

    @Override
    public List<Admin> selectAdmin(String name) {
        List<Admin> admin = adminDao.getAdmin(name);
        return admin;
    }
}
