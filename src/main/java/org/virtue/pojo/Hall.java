package org.virtue.pojo;

/**
 * 宴会厅信息表
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_hall")
public class Hall {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //宴会厅id
    @Column(name = "hall_id")
    private long hallId;
    //宴会厅类型
    @Column(name = "hall_type")
    private String hallType;
    //宴会厅号
    @Column(name = "hall_num")
    private int hallNum;
    //是否预定
    @Column(name = "hall_book")
    private char book;
    //是否空
    @Column(name = "hall_empty")
    private char empty;
    //是否停用
    @Column(name = "hall_stop")
    private char stop;
    //单价
    @Column(name = "hall_price")
    private float hallPrice;
    //桌子数量
    @Column(name = "hall_tableNum")
    private int hallTableNum;
    //最大人数
    @Column(name = "hall_maxNumber")
    private int hallMaxNumber;
    //备注
    @Column(name = "hall_remark")
    private String remark;

    public long getHallId() {
        return hallId;
    }

    public void setHallId(long hallId) {
        this.hallId = hallId;
    }

    public String getHallType() {
        return hallType;
    }

    public void setHallType(String hallType) {
        this.hallType = hallType;
    }

    public int getHallNum() {
        return hallNum;
    }

    public void setHallNum(int hallNum) {
        this.hallNum = hallNum;
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

    public float getHallPrice() {
        return hallPrice;
    }

    public void setHallPrice(float hallPrice) {
        this.hallPrice = hallPrice;
    }

    public int getHallTableNum() {
        return hallTableNum;
    }

    public void setHallTableNum(int hallTableNum) {
        this.hallTableNum = hallTableNum;
    }

    public int getHallMaxNumber() {
        return hallMaxNumber;
    }

    public void setHallMaxNumber(int hallMaxNumber) {
        this.hallMaxNumber = hallMaxNumber;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}