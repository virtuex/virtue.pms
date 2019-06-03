package org.virtue.pojo;

import javax.persistence.*;
import java.util.Date;

/**
 * 员工表
 */
@Entity
@Table(name = "pms_tb_staff")
public class Staff {
    //设置主键并且设置主键为自增
    /**
     * 工号（id）
     */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "staff_id")
    private long staffId;

    /**
     * 姓名
     */
    @Column(name = "staff_name")
    private String staffName;
    /**
     * 性别
     */
    @Column(name = "staff_gender")
    private String staffGender;
    /**
     * 年龄
     */
    @Column(name = "staff_age")
    private String staffAge;
    /**
     * 职位
     */
    @Column(name = "staff_position")
    private String staffPosition;
    /**
     * 入职时间
     */
    @Column(name = "staff_begin_date")
    private Date staffBeginDate;
    /**
     * 工资
     */
    @Column(name = "staff_salary")
    private int staffSalary;

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffGender() {
        return staffGender;
    }

    public void setStaffGender(String staffGender) {
        this.staffGender = staffGender;
    }

    public String getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(String staffAge) {
        this.staffAge = staffAge;
    }

    public String getStaffPosition() {
        return staffPosition;
    }

    public void setStaffPosition(String staffPosition) {
        this.staffPosition = staffPosition;
    }

    public Date getStaffBeginDate() {
        return staffBeginDate;
    }

    public void setStaffBeginDate(Date staffBeginDate) {
        this.staffBeginDate = staffBeginDate;
    }

    public int getStaffSalary() {
        return staffSalary;
    }

    public void setStaffSalary(int staffSalary) {
        this.staffSalary = staffSalary;
    }
}
