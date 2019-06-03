package org.virtue.pojo;

/**
 * 房间类型表
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_roomType")
public class RoomType {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //房间类型id
    @Column(name = "roomType_id")
    private long roomTypeId;
    //房间类型名
    @Column(name = "roomType_name")
    private String roomTypeName;
    //床位
    @Column(name = "roomType_bed")
    private int bed;
    //房间数量
    @Column(name = "roomType_roomNum")
    private int roomNum;
    //可用房间数量
    @Column(name = "roomType_availableNum")
    private int availableNum;
    //预定数量
    @Column(name = "roomType_bookNum")
    private String bookNum;
    //已经入住数量
    @Column(name = "roomType_livedNum")
    private int livedNum;

    public long getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(long roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(int bed) {
        this.bed = bed;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public int getAvailableNum() {
        return availableNum;
    }

    public void setAvailableNum(int availableNum) {
        this.availableNum = availableNum;
    }

    public String getBookNum() {
        return bookNum;
    }

    public void setBookNum(String bookNum) {
        this.bookNum = bookNum;
    }

    public int getLivedNum() {
        return livedNum;
    }

    public void setLivedNum(int livedNum) {
        this.livedNum = livedNum;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getRoomTypeRemark() {
        return roomTypeRemark;
    }

    public void setRoomTypeRemark(String roomTypeRemark) {
        this.roomTypeRemark = roomTypeRemark;
    }

    //单价
    @Column(name = "roomType_price")
    private float price;
    //备注
    @Column(name = "roomType_remark")
    private String roomTypeRemark;
}
