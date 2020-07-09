package com.clive.springtree.service.serviceImp;

import com.clive.springtree.SpringtreeApplication;
import com.clive.springtree.pojo.Admin;
import com.clive.springtree.service.AdminService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.Assert;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringtreeApplication.class})
class AdminServiceImlTest {
    @Autowired
    private AdminService adminService;
    @Test
    void addAdmin() {
        Admin admin = new Admin();
        admin.setCreateAt(new Date());
        admin.setEmail("1057850893@qq.com");
        admin.setLoginLast(new Date());
        admin.setUserName("陶智伟");
        admin.setPassword("tzw1995426");
        admin.setPhone("18257108806");
        admin.setLoginLast(new Date());
        Assert.notNull(adminService,"这个是空的");
        adminService.addAdmin(admin);
    }
}