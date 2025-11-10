package com.stacksimplify.restservices.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//Entity
@Entity
@Table(name = "user")
@JsonIgnoreProperties({"firstname", "lastname"})
public class User extends ResourceSupport {

	@Id
	@GeneratedValue
	private Long userid;
	@NotEmpty(message = "Username is mandatory field. Please provide username.")
	@Column(name = "USER_NAME", length = 50, nullable = false, unique = true)
	private String username;
	@Size(min = 2, message = "first name should have at least 2 characters.")
	@Column(name = "FIRST_NAME", length = 50, nullable = false)
	private String firstname;
	@Column(name = "SECOND_NAME", length = 50, nullable = false)
	private String secondname;
	@Column(name = "SSN", length = 50, nullable = false)
	@JsonIgnore
	private String ssn;
	
	@Column(name = "ROLE", length = 50, nullable = false)
	private String role;
	@Column(name = "EMAIL_ADDRESS", length = 50, nullable = false)
	private String email;
	@OneToMany(mappedBy = "user")
	private List<Order> orders;

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	// NO ARGUMENT CONSTRUCTOR
	public User() {

	}

//FIELD CONSTRUCTOR

	public User(Long userid,
			@NotEmpty(message = "Username is mandatory field. Please provide username.") String username,
			@Size(min = 2, message = "first name should have at least 2 characters.") String firstname,
			String secondname, String ssn, String role, String email, List<Order> orders) {
		super();
		this.userid = userid;
		this.username = username;
		this.firstname = firstname;
		this.secondname = secondname;
		this.ssn = ssn;
		this.role = role;
		this.email = email;
		this.orders = orders;
	}

	public String getUsername() {
		return username;
	}

	public Long getUserid() {
		return userid;
	}

	public void setUserid(Long userid) {
		this.userid = userid;
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
	// TO STRING METHOD (Optional required for bean logging)
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", firstname=" + firstname + ", secondname="
				+ secondname + ", ssn=" + ssn + ", role=" + role + ", email=" + email + ", orders=" + orders + "]";
	}

}
