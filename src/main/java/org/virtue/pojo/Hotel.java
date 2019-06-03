package org.virtue.pojo;

/**
 * 酒店信息表
 */

import javax.persistence.*;

@Entity
@Table(name = "tb_hotel")
public class Hotel {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //酒店id
    @Column(name = "hotel_id")
    private long hotelId;
    //酒店名称
    @Column(name = "hotel_name")
    private String hotelName;
    //酒店介绍
    @Column(name = "hotel_intro")
    private String HotelIntro;
    //酒店地址
    @Column(name = "hotel_address")
    private String hotelAddress;
    //酒店电话
    @Column(name = "hotel_phone")
    private String hotelPhone;
    //酒店邮箱
    @Column(name = "hotel_email")
    private String hotelEmail;

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelIntro() {
        return HotelIntro;
    }

    public void setHotelIntro(String hotelIntro) {
        HotelIntro = hotelIntro;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelPhone() {
        return hotelPhone;
    }

    public void setHotelPhone(String hotelPhone) {
        this.hotelPhone = hotelPhone;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }
}
