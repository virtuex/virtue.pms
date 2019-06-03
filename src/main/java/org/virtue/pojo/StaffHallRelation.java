package org.virtue.pojo;

/**
 * 员工宴会厅管理表
 */

import javax.persistence.*;

@Entity
@Table(name = "pms_tb_staff_hall")
public class StaffHallRelation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "staff_hall_id")
    private long staffHallId;
    /**
     * 员工ID
     */
    @Column(name = "staff_id")
    private  long staffId;

    /**
     * 宴会厅ID
     */
    @Column(name = "hall_id")
    private  long hallId;

    public long getStaffHallId() {
        return staffHallId;
    }

    public void setStaffHallId(long staffHallId) {
        this.staffHallId = staffHallId;
    }

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public long getHallId() {
        return hallId;
    }

    public void setHallId(long hallId) {
        this.hallId = hallId;
    }
}
