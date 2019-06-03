package org.virtue.pojo;

/**
 * 结算表
 */

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_settlement")
public class Settlement {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //结算id
    @Column(name = "settlement_id")
    private long settlementId;
    //入住id
    @Column(name = "checkIn_id")
    private long checkInId;
    //用户id
    @Column(name = "customer_id")
    private long customerId;
    //身份证
    @Column(name = "settlement_idCard")
    private String settlementIdCard;
    //电话号码
    @Column(name = "settlement_phoneNum")
    private String settlementPhoneNum;
    //房间号
    @Column(name = "settlement_roomNum")
    private int roomNum;
    //到达时间
    @Column(name = "settlement_arriveDate")
    private String arriveDate;
    //离开时间
    @Column(name = "settlement_leaveDate")
    private String leaveDate;
    //总金额
    @Column(name = "settlement_price")
    private float settlementPrice;

    public long getSettlementId() {
        return settlementId;
    }

    public void setSettlementId(long settlementId) {
        this.settlementId = settlementId;
    }

    public long getCheckInId() {
        return checkInId;
    }

    public void setCheckInId(long checkInId) {
        this.checkInId = checkInId;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }

    public String getSettlementIdCard() {
        return settlementIdCard;
    }

    public void setSettlementIdCard(String settlementIdCard) {
        this.settlementIdCard = settlementIdCard;
    }

    public String getSettlementPhoneNum() {
        return settlementPhoneNum;
    }

    public void setSettlementPhoneNum(String settlementPhoneNum) {
        this.settlementPhoneNum = settlementPhoneNum;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
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

    public float getSettlementPrice() {
        return settlementPrice;
    }

    public void setSettlementPrice(float settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public String getSettlementRemark() {
        return settlementRemark;
    }

    public void setSettlementRemark(String settlementRemark) {
        this.settlementRemark = settlementRemark;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    //备注
    @Column(name = "settlement_remark")
    private String settlementRemark;
    //结算单创建时间
    @Column(name = "settlement_createTime")
    private Date createTime;
}