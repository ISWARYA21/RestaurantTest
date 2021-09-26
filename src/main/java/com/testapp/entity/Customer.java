package com.testapp.entity;
import javax.persistence.*;
@Entity
@Table(name = "customer")

public class Customer {
	public Customer() {
		
	}
	public Customer(String firstName, String lastName, int age, String gender, String mobileNumber, 
			String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.mobileNumber = mobileNumber;
		this.email = email;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="customerid")
private int customerId;
	
	@Column(name="firstname")
private String firstName;
	
	@Column(name="lastname")
private String lastName;
	
	@Column(name="age")
private int age;
	
	@Column(name="gender")
private String gender;
	
	@Column(name="mobilenumber")
private String mobileNumber;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "addressid", referencedColumnName = "addid")
	private Address address;

	@Column(name="email")
private String email;
	
	
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
	}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

}
