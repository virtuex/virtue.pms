package org.virtue.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 宴会厅订单
 */
@Entity
@Table(name = "pms_tb_hall_order")
public class HallOrder {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "hall_order_id")
    /**
     * 订单ID
     */

    private long hallOrderId;
    /**
     * 预计开始时间
     */
    @Column(name = "hall_order_plan_starttime")
    private Date hallOrderPlanStartTime;
    /**
     * 实际开始时间
     */
    @Column(name = "hall_order_real_starttime")
    private Date hallRealPlanStartTime;
    /**
     * 下单时间
     */
    @Column(name = "hall_order_order_time")
    private Date hallOrderOrderTime;
    /**
     * 订单状态
     */
    @Column(name = "hall_order_status")
    private String hallOrderStatus;
    /**
     * 会员ID
     */
    @Column(name = "vip_id")
    private long vipUserId;
    /**
     * 宴会厅ID
     */
    @Column(name = "hall_order_hall_id")
    private long hallId;
    /**
     * 是否已通知
     */
    @Column(name = "hall_order_has_notify")
    private int orderHasNotify;
    /**
     * 订单费用
     */
    @Column(name = "hall_order_fee")
    private int orderFee;
    /**
     * 结束时间
     */
    @Column(name = "hall_order_end_time")
    private Date hallOrderEndTime;

    public long getHallOrderId() {
        return hallOrderId;
    }

    public void setHallOrderId(long hallOrderId) {
        this.hallOrderId = hallOrderId;
    }

    public Date getHallOrderPlanStartTime() {
        return hallOrderPlanStartTime;
    }

    public void setHallOrderPlanStartTime(Date hallOrderPlanStartTime) {
        this.hallOrderPlanStartTime = hallOrderPlanStartTime;
    }

    public Date getHallRealPlanStartTime() {
        return hallRealPlanStartTime;
    }

    public void setHallRealPlanStartTime(Date hallRealPlanStartTime) {
        this.hallRealPlanStartTime = hallRealPlanStartTime;
    }

    public Date getHallOrderOrderTime() {
        return hallOrderOrderTime;
    }

    public void setHallOrderOrderTime(Date hallOrderOrderTime) {
        this.hallOrderOrderTime = hallOrderOrderTime;
    }

    public String getHallOrderStatus() {
        return hallOrderStatus;
    }

    public void setHallOrderStatus(String hallOrderStatus) {
        this.hallOrderStatus = hallOrderStatus;
    }

    public long getVipUserId() {
        return vipUserId;
    }

    public void setVipUserId(long vipUserId) {
        this.vipUserId = vipUserId;
    }

    public long getHallId() {
        return hallId;
    }

    public void setHallId(long hallId) {
        this.hallId = hallId;
    }

    public int getOrderHasNotify() {
        return orderHasNotify;
    }

    public void setOrderHasNotify(int orderHasNotify) {
        this.orderHasNotify = orderHasNotify;
    }

    public int getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(int orderFee) {
        this.orderFee = orderFee;
    }

    public Date getHallOrderEndTime() {
        return hallOrderEndTime;
    }

    public void setHallOrderEndTime(Date hallOrderEndTime) {
        this.hallOrderEndTime = hallOrderEndTime;
    }
}
