package org.virtue.pojo;

import javax.persistence.*;

/**
 * 留言表
 */
@Entity
@Table(name = "pms_tb_message")
public class Message {
    //设置主键并且设置主键为自增
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "message_id")
    private long messageId;

    //内容
    @Column(name = "message_content")
    private String messageContent;
    //主题
    @Column(name = "message_subject")
    private String messageSubject;
    //会员ID
    @Column(name = "vip_id")
    private String vipId;

    public long getMessageId() {
        return messageId;
    }

    public void setMessageId(long messageId) {
        this.messageId = messageId;
    }

    public String getMessageContent() {
        return messageContent;
    }

    public void setMessageContent(String messageContent) {
        this.messageContent = messageContent;
    }

    public String getMessageSubject() {
        return messageSubject;
    }

    public void setMessageSubject(String messageSubject) {
        this.messageSubject = messageSubject;
    }

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }
}
