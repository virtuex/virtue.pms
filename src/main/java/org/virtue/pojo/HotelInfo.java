package org.virtue.pojo;

import javax.persistence.*;

@Entity
@Table(name = "pms_tb_hotel_info")
public class HotelInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "hotel_id")
    private String hotelId;
    //    酒店名称
    @Column(name = "hotel_name")
    private String hotelName;
    @Column(name = "hotel_desc")
    private String hotelDesc;
    @Column(name = "hotel_address")
    private String hotelAddress;
    @Column(name = "hotel_tel")
    private String hotelTel;
    @Column(name = "hotel_email")
    private String hotelEmail;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelDesc() {
        return hotelDesc;
    }

    public void setHotelDesc(String hotelDesc) {
        this.hotelDesc = hotelDesc;
    }

    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String getHotelTel() {
        return hotelTel;
    }

    public void setHotelTel(String hotelTel) {
        this.hotelTel = hotelTel;
    }

    public String getHotelEmail() {
        return hotelEmail;
    }

    public void setHotelEmail(String hotelEmail) {
        this.hotelEmail = hotelEmail;
    }
}
