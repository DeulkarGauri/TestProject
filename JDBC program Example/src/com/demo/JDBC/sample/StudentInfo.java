package com.demo.JDBC.sample;

public class StudentInfo {
	private int stud_id;
	private String name;
	private String phone;
	private String city;

	public int getStud_id() {
		return stud_id;
	}

	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "StudentInfo [stud_id=" + stud_id + ", name=" + name + ", phone=" + phone + ", city=" + city + "]";
	}

	public StudentInfo(int stud_id, String name, String phone, String city) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public StudentInfo(String name, String phone, String city) {
		super();
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public StudentInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

}
