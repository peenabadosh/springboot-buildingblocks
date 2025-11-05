package com.stacksimplify.restservices.Hello;

public class UserDetails {

	private String firstname;
	private String secondname;
	private String city;

	public UserDetails(String firstname, String secondname, String city) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.city = city;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getSecondname() {
		return secondname;
	}

	public String getCity() {
		return city;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "UserDetails [firstname=" + firstname + ", secondname=" + secondname + ", city=" + city + "]";
	}

}
