package org.dd.note.common.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.dd.note.common.entity.BaseEntity;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * note用户实体类
 * 
 * @author liuxy
 * @v2014年10月14日下午2:08:43
 * @version 1.0
 */
@Entity
@Table(name = "dd_userinfo")
public class UserInfo extends BaseEntity<Long>{
	/**
	 * 
	 */
	private static final long serialVersionUID = -4590478626137941653L;
	/**
	 * 用户编码
	 */
	 @Column(name = "code", length = 200)
	private String code;
	/**
	 * 用户名称
	 */
	 @Column(name = "name", unique = true, length = 200)
	private String name;
	/**
	 * 用户密码
	 */
	 @Column(name = "password", length = 200)
	private String password;
	/**
	 * 用户邮箱
	 */
	 @Column(name = "email", length = 200)
	private String email;
	/**
	 * 用户等级
	 */
	 @Column(name = "level", length = 100)
	private String level;
	/**
	 * 用户笔记容量
	 */
	 @Column(name = "voluname", length = 100)
	private String voluname;
	/**
	 * 删除标志位i
	 */
	 @Column(name = "dr", length = 100)
	private String dr;
	/**
	 * 注册时间
	 */
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Column(name = "registerDate")
    private Date registerDate;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getVoluname() {
		return voluname;
	}

	public void setVoluname(String voluname) {
		this.voluname = voluname;
	}

	public String getDr() {
		return dr;
	}

	public void setDr(String dr) {
		this.dr = dr;
	}


	@Override
	public String toString() {
		return "用户主键:"+this.getId()+",用户名:"+this.getName()+",密码:"+this.getPassword();
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
	}
	
	
}