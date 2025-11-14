package com.stacksimplify.restservices.dtos;

import java.util.List;

import com.stacksimplify.restservices.entities.Order;

public class UserDtoV2 {
	private Long userid;
	private String username;
	private String firstname;
	private String secondname;
	private String ssn;
	private String role;
	private String email;
	private List<Order> orders;
	private String address;

	public UserDtoV2() {

	}

	public UserDtoV2(Long userid, String username, String firstname, String secondname, String ssn, String role,
			String email, List<Order> orders, String address) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstname = firstname;
		this.secondname = secondname;
		this.ssn = ssn;
		this.role = role;
		this.email = email;
		this.orders = orders;
		this.address = address;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
