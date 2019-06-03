package org.virtue.pojo;

import javax.persistence.*;

/**
 * 客房
 */
@Entity
@Table(name = "pms_tb_room")
public class Room {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "room_id")
    /**
     * 宴会厅ID
     */
    private long roomId;
    /**
     * 名称
     */
    @Column(name = "room_name")
    private String roomName;
    /**
     * 面积
     */
    @Column(name = "room_area")
    private int roomArea;
    /**
     * 价格
     */
    @Column(name = "room_price")
    private int roomPrice;
    /**
     * 类型
     */
    @Column(name = "room_type")
    private String roomType;
    /**
     * 介绍
     */
    @Column(name = "room_desc")
    private String roomDesc;

    /**
     * 图片
     */
    @Column(name = "room_image")
    private String roomImage;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(int roomArea) {
        this.roomArea = roomArea;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public String getRoomDesc() {
        return roomDesc;
    }

    public void setRoomDesc(String roomDesc) {
        this.roomDesc = roomDesc;
    }

    public String getRoomImage() {
        return roomImage;
    }

    public void setRoomImage(String roomImage) {
        this.roomImage = roomImage;
    }
}
