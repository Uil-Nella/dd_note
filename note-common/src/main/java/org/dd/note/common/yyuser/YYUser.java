package org.dd.note.common.yyuser;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import net.sf.json.JSONObject;

import org.dd.note.common.entity.BaseEntity;

/**
 * 绑定信息实体类
 * <p/>
 * <p>
 * 
 * @author 刘新宇
 *
 *         <p>
 * @date 2014年11月30日 下午8:38:26
 *       <p>
 * @version 0.0.1
 */
@Entity
@Table(name = "yy_user")
public class YYUser extends BaseEntity<Long> {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4590478626137941653L;
	/**
	 * 用户id
	 */
	@Column(name = "userid", length = 200)
	private String userid;
	/**
	 * 用户名称
	 */
	@Column(name = "username", unique = true, length = 200)
	private String username;
	/**
	 * 用户密码
	 */
	@Column(name = "password", length = 200)
	private String password;

	@Override
	public String toString() {
		return JSONObject.fromObject(this).toString();
	}

	public String toLocalString() {
		return "绑定信息:" + this.getId() + ",员工ID:" + this.getUserid() + ",用户名:"
				+ this.getUsername() + ",密码:" + this.getPassword();
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}