package org.virtue.pojo;

import javax.persistence.*;

/**
 * VIP
 */
@Entity
@Table(name = "pms_tb_vip")
public class VipUser {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "vip_id")
    /**
     * 会员ID
     */
    private long vipId;

    /**
     * 姓名
     */
    @Column(name = "vip_name")
    private long vipName;
    /**
     * 生日
     */
    @Column(name = "vip_birthday")
    private long vipBirthday;
    /**
     * 性别
     */
    @Column(name = "vip_gender")
    private long vipGender;
    /**
     * 会员等级
     */
    @Column(name = "vip_level")
    private long vipLevel;
    /**
     * 年龄
     */
    @Column(name = "vip_age")
    private long vipAge;
    /**
     * 消费积分
     */
    @Column(name = "vip_integral")
    private long vipIntegral;

    public long getVipId() {
        return vipId;
    }

    public void setVipId(long vipId) {
        this.vipId = vipId;
    }

    public long getVipName() {
        return vipName;
    }

    public void setVipName(long vipName) {
        this.vipName = vipName;
    }

    public long getVipBirthday() {
        return vipBirthday;
    }

    public void setVipBirthday(long vipBirthday) {
        this.vipBirthday = vipBirthday;
    }

    public long getVipGender() {
        return vipGender;
    }

    public void setVipGender(long vipGender) {
        this.vipGender = vipGender;
    }

    public long getVipLevel() {
        return vipLevel;
    }

    public void setVipLevel(long vipLevel) {
        this.vipLevel = vipLevel;
    }

    public long getVipAge() {
        return vipAge;
    }

    public void setVipAge(long vipAge) {
        this.vipAge = vipAge;
    }

    public long getVipIntegral() {
        return vipIntegral;
    }

    public void setVipIntegral(long vipIntegral) {
        this.vipIntegral = vipIntegral;
    }
}
