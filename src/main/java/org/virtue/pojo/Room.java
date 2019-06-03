package org.virtue.pojo;

/**
 * 房间信息表
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_room")
public class Room {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //房间id
    @Column(name = "room_id")
    private long roomId;
    //房间名
    @Column(name = "roomType_id")
    private String roomUsername;
    //房间号
    @Column(name = "room_num")
    private int roomNum;
    //是否预定
    @Column(name = "room_book")
    private char book;
    //是否空
    @Column(name = "room_empty")
    private char empty;
    //是否停用
    @Column(name = "room_stop")
    private char stop;
    //备注
    @Column(name = "room_remark")
    private String remark;

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }

    public String getRoomUsername() {
        return roomUsername;
    }

    public void setRoomUsername(String roomUsername) {
        this.roomUsername = roomUsername;
    }

    public int getRoomNum() {
        return roomNum;
    }

    public void setRoomNum(int roomNum) {
        this.roomNum = roomNum;
    }

    public char getBook() {
        return book;
    }

    public void setBook(char book) {
        this.book = book;
    }

    public char getEmpty() {
        return empty;
    }

    public void setEmpty(char empty) {
        this.empty = empty;
    }

    public char getStop() {
        return stop;
    }

    public void setStop(char stop) {
        this.stop = stop;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


}
