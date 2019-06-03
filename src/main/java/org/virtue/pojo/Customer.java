package org.virtue.pojo;

/**
 * 用户信息表
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_customer")
public class Customer {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //用户id
    @Column(name = "customer_id")
    private long customerId;
    //用户名
    @Column(name = "customer_Username")
    private String customerUsername;
    //用户密码
    @Column(name = "customer_password")
    private String customerPassword;
    //用户姓名
    @Column(name = "customer_name")
    private String customerName;
    //证件类别
    @Column(name = "customer_certificatesType")
    private String certificatesType;
    //证件号码
    @Column(name = "customer_certificatesNum")
    private String certificatesNum;
    //电话号码
    @Column(name = "customer_phoneNum")
    private String phoneNum;
    //用户邮箱
    @Column(name = "customer_email")
    private String customerEmail;
    //会员权限
    @Column(name = "customer_status")
    private String customerStatus;

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCustomerUsername() {
        return customerUsername;
    }

    public void setCustomerUsername(String customerUsername) {
        this.customerUsername = customerUsername;
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCertificatesType() {
        return certificatesType;
    }

    public void setCertificatesType(String certificatesType) {
        this.certificatesType = certificatesType;
    }

    public String getCertificatesNum() {
        return certificatesNum;
    }

    public void setCertificatesNum(String certificatesNum) {
        this.certificatesNum = certificatesNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(String customerStatus) {
        this.customerStatus = customerStatus;
    }
}
