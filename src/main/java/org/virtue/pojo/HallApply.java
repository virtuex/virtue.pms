package org.virtue.pojo;

/**
 * 宴会厅使用表
 */

import javax.persistence.*;
import java.util.Date;

public class HallApply {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //宴会厅使用id
    @Column(name = "hallApply_id")
    private long hallApplyId;
    //管理员id
    @Column(name = "admin_id")
    private long adminId;
    //宴会厅id
    @Column(name = "hall_id")
    private long hallId;
    //用户id
    @Column(name = "Customer_id")
    private long customerId;
    //身份证
    @Column(name = "hallApply_idCard")
    private String hallApplyIdCard;
    //电话号码
    @Column(name = "hallApply_phoneNum")
    private String hallApplyPhoneNum;
    //状态
    @Column(name = "hallApply_status")
    private String status;
    //到达时间
    @Column(name = "hallApply_arriveDate")
    private String arriveDate;
    //离开时间
    @Column(name = "hallApply_leaveDate")
    private String leaveDate;
    //总金额
    @Column(name = "hallApply_price")
    private float hallApplyPrice;
    //备注
    @Column(name = "hallApply_remark")
    private String hallApplyRemark;
    //宴会厅使用单创建时间
    @Column(name = "hallApply_createTime")
    private Date createTime;

    public long getHallApplyId() {
        return hallApplyId;
    }

    public void setHallApplyId(long hallApplyId) {
        this.hallApplyId = hallApplyId;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public long getHallId() {
        return hallId;
    }

    public void setHallId(long hallId) {
        this.hallId = hallId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getHallApplyIdCard() {
        return hallApplyIdCard;
    }

    public void setHallApplyIdCard(String hallApplyIdCard) {
        this.hallApplyIdCard = hallApplyIdCard;
    }

    public String getHallApplyPhoneNum() {
        return hallApplyPhoneNum;
    }

    public void setHallApplyPhoneNum(String hallApplyPhoneNum) {
        this.hallApplyPhoneNum = hallApplyPhoneNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getArriveDate() {
        return arriveDate;
    }

    public void setArriveDate(String arriveDate) {
        this.arriveDate = arriveDate;
    }

    public String getLeaveDate() {
        return leaveDate;
    }

    public void setLeaveDate(String leaveDate) {
        this.leaveDate = leaveDate;
    }

    public float getHallApplyPrice() {
        return hallApplyPrice;
    }

    public void setHallApplyPrice(float hallApplyPrice) {
        this.hallApplyPrice = hallApplyPrice;
    }

    public String getHallApplyRemark() {
        return hallApplyRemark;
    }

    public void setHallApplyRemark(String hallApplyRemark) {
        this.hallApplyRemark = hallApplyRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
