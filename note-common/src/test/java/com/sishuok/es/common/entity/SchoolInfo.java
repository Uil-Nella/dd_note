package com.sishuok.es.common.entity;

import javax.persistence.*;

import org.dd.note.common.entity.BaseEntity;

/**
 * <p>学校信息</p>
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午7:41:01
 * <p> @version 0.0.1
 */
@Entity
@Table(name = "user_schoolinfo")
public class SchoolInfo extends BaseEntity<Long> {

    @ManyToOne()
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    /**
     * 学校名称
     */
    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "type", length = 2)
    @Enumerated(EnumType.ORDINAL)
    private SchoolType type;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SchoolType getType() {
        return type;
    }

    public void setType(SchoolType type) {
        this.type = type;
    }
}
