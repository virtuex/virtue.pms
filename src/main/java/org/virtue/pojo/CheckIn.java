package org.virtue.pojo;

/**
 * 入住信息表
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_checkIn")
public class CheckIn {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //入住id
    @Column(name = "checkIn_id")
    private long checkInId;
    //订单id
    @Column(name = "order_id")
    private long orderId;
    //管理员id
    @Column(name = "admin_id")
    private long adminId;
    //房间id
    @Column(name = "room_id")
    private long roomId;
    //用户id
    @Column(name = "customer_id")
    private long customerId;
    //身份证
    @Column(name = "checkIn_idCard")
    private String checkInIdCard;
    //电话号码
    @Column(name = "checkIn_phoneNum")
    private String checkInPhoneNum;
    //入住价格
    @Column(name = "checkIn_price")
    private float checkInPrice;
    //状态
    @Column(name = "checkIn_status")
    private String status;
    //到达时间
    @Column(name = "checkIn_arriveDate")
    private String arriveDate;
    //离开时间
    @Column(name = "checkIn_leaveDate")
    private String leaveDate;
    //备注
    @Column(name = "checkIn_remark")
    private String checkInRemark;
    //入住创建时间
    @Column(name = "checkIn_createTime")
    private Date createTime;

    public long getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(long checkInId) {
        this.checkInId = checkInId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getAdminId() {
        return adminId;
    }

    public void setAdminId(long adminId) {
        this.adminId = adminId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getCheckInIdCard() {
        return checkInIdCard;
    }

    public void setCheckInIdCard(String checkInIdCard) {
        this.checkInIdCard = checkInIdCard;
    }

    public String getCheckInPhoneNum() {
        return checkInPhoneNum;
    }

    public void setCheckInPhoneNum(String checkInPhoneNum) {
        this.checkInPhoneNum = checkInPhoneNum;
    }

    public float getCheckInPrice() {
        return checkInPrice;
    }

    public void setCheckInPrice(float checkInPrice) {
        this.checkInPrice = checkInPrice;
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

    public String getCheckInRemark() {
        return checkInRemark;
    }

    public void setCheckInRemark(String checkInRemark) {
        this.checkInRemark = checkInRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }


}