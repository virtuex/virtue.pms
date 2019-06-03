package org.virtue.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 客房订单
 */
@Entity
@Table(name = "pms_tb_room_order")
public class RoomOrder {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_order_id")
    /**
     * 订单ID
     */
    private long roomOrderId;
    /**
     * 预计入住时间
     */
    @Column(name = "room_order_plan_intime")
    private Date roomOrderPlanInTime;
    /**
     * 实际入住时间
     */
    @Column(name = "room_order_real_intime")
    private Date roomOrderRealInTime;
    /**
     * 退房时间
     */
    @Column(name = "room_order_out_time")
    private Date roomOrderOutTime;
    /**
     * 订单状态
     */
    @Column(name = "room_order_status")
    private String roomOrderStatus;
    /**
     * 会员ID
     */
    @Column(name = "vip_id")
    private long vipUserId;
    /**
     * 客房ID
     */
    @Column(name = "room_id")
    private long roomId;
    /**
     * 下单时间
     */
    @Column(name = "room_order_order_time")
    private Date roomOrderOrderTime;
    /**
     * 是否已通知
     */
    @Column(name = "room_order_has_notify")
    private int hasNotify;
    /**
     * 订单费用
     */
    @Column(name = "room_order_fee")
    private int roomOrderFee;

    public long getRoomOrderId() {
        return roomOrderId;
    }

    public void setRoomOrderId(long roomOrderId) {
        this.roomOrderId = roomOrderId;
    }

    public Date getRoomOrderPlanInTime() {
        return roomOrderPlanInTime;
    }

    public void setRoomOrderPlanInTime(Date roomOrderPlanInTime) {
        this.roomOrderPlanInTime = roomOrderPlanInTime;
    }

    public Date getRoomOrderRealInTime() {
        return roomOrderRealInTime;
    }

    public void setRoomOrderRealInTime(Date roomOrderRealInTime) {
        this.roomOrderRealInTime = roomOrderRealInTime;
    }

    public Date getRoomOrderOutTime() {
        return roomOrderOutTime;
    }

    public void setRoomOrderOutTime(Date roomOrderOutTime) {
        this.roomOrderOutTime = roomOrderOutTime;
    }

    public String getRoomOrderStatus() {
        return roomOrderStatus;
    }

    public void setRoomOrderStatus(String roomOrderStatus) {
        this.roomOrderStatus = roomOrderStatus;
    }

    public long getVipUserId() {
        return vipUserId;
    }

    public void setVipUserId(long vipUserId) {
        this.vipUserId = vipUserId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public Date getRoomOrderOrderTime() {
        return roomOrderOrderTime;
    }

    public void setRoomOrderOrderTime(Date roomOrderOrderTime) {
        this.roomOrderOrderTime = roomOrderOrderTime;
    }

    public int getHasNotify() {
        return hasNotify;
    }

    public void setHasNotify(int hasNotify) {
        this.hasNotify = hasNotify;
    }

    public int getRoomOrderFee() {
        return roomOrderFee;
    }

    public void setRoomOrderFee(int roomOrderFee) {
        this.roomOrderFee = roomOrderFee;
    }
}
