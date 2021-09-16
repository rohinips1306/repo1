package com.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Insurance {

	@Id
	@Column
	private String id;
	@Column
	private String cnumber;
	@Column
	private String ctype;
	@Column
	private String dob;
	@Column
	private String mobile;
	@Column
	private String address;
	@Column
	private String state;
	@Column
	private String iamt;
	@Column
	private String name;
	@Column
	private String password;
	@Column
	private String age;
	@Column
	private String gender;
	@Column
	private String email;
	@Column
	private String city;
	@Column
	private String nation;
	@Column
	private String nop;
	@Column
	private String date;
	
	
	
	public Insurance() {
		super();
	}


	public Insurance(String id, String cnumber, String ctype, String dob, String mobile, String address, String state,
			String iamt, String name, String password, String age, String gender, String email,
			String city, String nation, String nop, String date) {
		super();
		this.id = id;
		this.cnumber = cnumber;
		this.ctype = ctype;
		this.dob = dob;
		this.mobile = mobile;
		this.address = address;
		this.state = state;
		this.iamt = iamt;
		this.name = name;
		this.password = password;
		this.age = age;
		this.gender = gender;
		this.email = email;
		this.city = city;
		this.nation = nation;
		this.nop = nop;
		this.date = date;
	}


	public Insurance(String cnumber, String password) {
		super();
		this.cnumber = cnumber;
		this.password = password;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCnumber() {
		return cnumber;
	}


	public void setCnumber(String cnumber) {
		this.cnumber = cnumber;
	}


	public String getCtype() {
		return ctype;
	}


	public void setCtype(String ctype) {
		this.ctype = ctype;
	}


	public String getDob() {
		return dob;
	}


	public void setDob(String dob) {
		this.dob = dob;
	}


	public String getMobile() {
		return mobile;
	}


	public void setMobile(String mobile) {
		this.mobile = mobile;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getIamt() {
		return iamt;
	}


	public void setIamt(String iamt) {
		this.iamt = iamt;
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

	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getNation() {
		return nation;
	}


	public void setNation(String nation) {
		this.nation = nation;
	}


	public String getNop() {
		return nop;
	}


	public void setNop(String nop) {
		this.nop = nop;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	
	
	
	
	
}
