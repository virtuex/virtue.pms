package org.virtue.pojo;

/**
 * 后台人员信息表
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_admin")
public class Admin {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //后台人员id
    @Column(name = "admin_id")
    private long adminId;
    //后台人员用户名
    @Column(name = "admin_username")
    private String adminUsername;
    //后台人员密码
    @Column(name = "admin_password")
    private String adminPassword;
    //后台人员姓名
    @Column(name = "admin_realname")
    private String adminRealname;
    //后台人员服务范围
    @Column(name = "admin_service")
    private String adminService;
    //后台人员介绍
    @Column(name = "admin_introduction")
    private String adminIntroduction;
    //后台人员权限
    @Column(name = "admin_status")
    private String adminStatus;

    public long getAdminId() {
        return adminId;
    }

    public String getAdminUsername() {
        return adminUsername;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public String getAdminRealname() {
        return adminRealname;
    }

    public String getAdminService() {
        return adminService;
    }

    public String getAdminIntroduction() {
        return adminIntroduction;
    }

    public String getAdminStatus() {
        return adminStatus;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public void setAdminUsername(String adminUsername) {
        this.adminUsername = adminUsername;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public void setAdminRealname(String adminRealname) {
        this.adminRealname = adminRealname;
    }

    public void setAdminService(String adminService) {
        this.adminService = adminService;
    }

    public void setAdminIntroduction(String adminIntroduction) {
        this.adminIntroduction = adminIntroduction;
    }

    public void setAdminStatus(String adminStatus) {
        this.adminStatus = adminStatus;
    }
}
