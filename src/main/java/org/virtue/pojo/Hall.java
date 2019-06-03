package org.virtue.pojo;

import javax.persistence.*;

/**
 * 宴会厅
 */
@Entity
@Table(name = "pms_tb_hall")
public class Hall {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "hall_id")
    /**
     * 宴会厅ID
     */
    private long hallId;

    /**
     * 名称
     */
    @Column(name = "hall_name")
    private String hallName;
    /**
     * 价格
     */
    @Column(name = "hall_price")
    private int hallPrice;
    /**
     * 图片
     */
    @Column(name = "hall_image_path")
    private String hallImagePath;
    /**
     * 类型
     */
    @Column(name = "hall_type")
    private String hallType;
    /**
     * 介绍
     */
    @Column(name = "hall_desc")
    private String hallDesc;
    /**
     * 面积
     */
    @Column(name = "hall_area")
    private int hallArea;
    /**
     * 座位数
     */
    @Column(name = "hall_site_num")
    private int hallSiteNum;

    public long getHallId() {
        return hallId;
    }

    public void setHallId(long hallId) {
        this.hallId = hallId;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public int getHallPrice() {
        return hallPrice;
    }

    public void setHallPrice(int hallPrice) {
        this.hallPrice = hallPrice;
    }

    public String getHallImagePath() {
        return hallImagePath;
    }

    public void setHallImagePath(String hallImagePath) {
        this.hallImagePath = hallImagePath;
    }

    public String getHallType() {
        return hallType;
    }

    public void setHallType(String hallType) {
        this.hallType = hallType;
    }

    public String getHallDesc() {
        return hallDesc;
    }

    public void setHallDesc(String hallDesc) {
        this.hallDesc = hallDesc;
    }

    public int getHallArea() {
        return hallArea;
    }

    public void setHallArea(int hallArea) {
        this.hallArea = hallArea;
    }

    public int getHallSiteNum() {
        return hallSiteNum;
    }

    public void setHallSiteNum(int hallSiteNum) {
        this.hallSiteNum = hallSiteNum;
    }
}
