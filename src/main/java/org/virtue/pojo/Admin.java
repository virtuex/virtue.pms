package org.virtue.pojo;

import javax.persistence.*;

@Entity
@Table(name = "pms_tb_admin")
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "admin_id")
    private long adminId;
    @Column(name = "admin_name")
    private String adminName;
    @Column(name = "admin_password")
    private String adminPassword;
    @Column(name = "admin_type")
    private String adminType;

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    public String getAdminType() {
        return adminType;
    }

    public void setAdminType(String adminType) {
        this.adminType = adminType;
    }
}
