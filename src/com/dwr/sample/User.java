package com.dwr.sample;

public class User {
	// 登陆ID，主键唯一
	private String id;
	// 姓名
	private String name;
	// 口令
	private String password;
	// 电子邮件
	private String email;

	public User() {
		super();
	}

	public User(String id, String name, String password, String email) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
}
