package com.sishuok.es.common.entity;

import org.dd.note.common.entity.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

import java.util.Date;

/**
 * <p>用户基本信息</p>
 * <p/>
 * <p> @author 刘新宇
 *
 * <p> @date 2014年11月17日 下午7:40:46
 * <p> @version 0.0.1
 */
@Entity
@Table(name = "user_baseinfo")
public class BaseInfo extends BaseEntity<Long> {

    @OneToOne()
    @JoinColumn(name = "user_id", unique = true, nullable = false, updatable = false)
    private User user;

    /**
     * 真实名称
     */
    @Column(name = "realname", length = 100)
    private String realname;

    /**
     * 性别
     */
    @Column(name = "sex", length = 2)
    @Enumerated(EnumType.ORDINAL)
    private Sex sex;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "age")
    private int age;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
