package com.qfedu.house.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_user")
public class User implements Serializable {
	@Id
	@Column(name = "userid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Pattern(regexp = "\\w{3,20}"/* ,message="用户名必须使用字母数字下划线且长度为6-20" */)
	private String username;
	@Size(min = 6, max = 20/* ,message="密码至少6个字符最多20个字符" */)
	private String password;
	private String realname;
	private String tel;
	@Column(name = "isadmin")
	private Boolean admin;
	@Transient
	private String ipAddress;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String username, String password, String realname, String tel, Boolean admin) {
		super();
		this.username = username;
		this.password = password;
		this.realname = realname;
		this.tel = tel;
		this.admin = admin;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}
}
