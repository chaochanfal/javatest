package com.example.demo;



public class User {
    private int  id;
    private String password;
    private String name;
    private String sex;
    private String date;
    private String phoncode;
    private String address;
    
	public User(String name,String password) {
	super();
	this.name=name;
	this.password=password;
	}
    public int  getId() {
        return id;
    }
    public void setId(int  id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSex() {
        return sex;
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPhoncode() {
		return phoncode;
	}
	public void setPhoncode(String phoncode) {
		this.phoncode = phoncode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
