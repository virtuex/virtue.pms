package org.virtue.pojo;

/**
 * 订单信息表
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_order")
public class Order {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //订单id
    @Column(name = "order_id")
    private long orderId;
    //管理员id
    @Column(name = "admin_id")
    private long adminid;
    //房间类型id
    @Column(name = "roomType_id")
    private long roomTypeId;
    //用户id
    @Column(name = "customer_id")
    private long customerId;
    //身份证
    @Column(name = "order_idCard")
    private String orderIdCard;
    //电话号码
    @Column(name = "order_phoneNum")
    private String orderPhoneNum;
    //状态
    @Column(name = "order_status")
    private String status;
    //到达时间
    @Column(name = "order_arriveDate")
    private String arriveDate;
    //离开时间
    @Column(name = "order_leaveDate")
    private String leaveDate;
    //备注
    @Column(name = "order_remark")
    private String orderRemark;
    //订单创建时间
    @Column(name = "order_createTime")
    private Date createTime;

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(long orderId) {
        this.orderId = orderId;
    }

    public long getAdminid() {
        return adminid;
    }

    public void setAdminid(long adminid) {
        this.adminid = adminid;
    }

    public long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerIdId(long customerId) {
        this.customerId = customerId;
    }

    public String getOrderIdCard() {
        return orderIdCard;
    }

    public void setOrderIdCard(String orderIdCard) {
        this.orderIdCard = orderIdCard;
    }

    public String getOrderPhoneNum() {
        return orderPhoneNum;
    }

    public void setOrderPhoneNum(String orderPhoneNum) {
        this.orderPhoneNum = orderPhoneNum;
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

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
