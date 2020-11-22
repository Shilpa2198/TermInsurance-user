package com.onlineterminsurance.App.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USER_DETAILS")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="user_id",nullable=false)
	private int userId;
	@Column(name="first_name",nullable=false)
	private String fname;
	@Column(name="last_name",nullable=false)
	private String lname;
	@Column(name="phone_no",nullable=false)
	private Long phoneno;
	//@Column(name="Address",nullable=false)
	//String address;
	@Column(name="date_of_birth",nullable=false)
	private String dob;
	@Column(name="aadhar_no",nullable=false)
	private String aadhar;
	
	public User() {
		super();
	}
	public User(String fname, String lname, Long i, String ad, String dob, String aadhar) {
		super();
		//UserId = userId;
		this.fname = fname;
		this.lname = lname;
		this.phoneno = i;
		//this.address = ad;
		this.dob = dob;
		this.aadhar = aadhar;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public Long getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Long phoneno) {
		this.phoneno = phoneno;
	}
   /*	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}*/
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getAadhar() {
		return aadhar;
	}
	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", phoneno=" + phoneno
				+ ", dob=" + dob + ", aadhar=" + aadhar + "]";
	}
	
}
	
	
	
