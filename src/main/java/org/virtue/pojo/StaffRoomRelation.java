package org.virtue.pojo;

import javax.persistence.*;

/**
 *
 */
@Entity
@Table(name = "pms_tb_staff_room")
public class StaffRoomRelation {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "staff_room_id")
    private long staffRoomId;

    /**
     * 员工ID
     */
    @Column(name = "staff_id")
    private  long staffId;

    /**
     * 宴会厅ID
     */
    @Column(name = "room_id")
    private  long roomId;

    public long getStaffRoomId() {
        return staffRoomId;
    }

    public void setStaffRoomId(long staffRoomId) {
        this.staffRoomId = staffRoomId;
    }

    public long getStaffId() {
        return staffId;
    }

    public void setStaffId(long staffId) {
        this.staffId = staffId;
    }

    public long getRoomId() {
        return roomId;
    }

    public void setRoomId(long roomId) {
        this.roomId = roomId;
    }
}
