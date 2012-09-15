package com.tcs.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;


import javax.persistence.Table;

@Entity
@Table (name = "user")
public class User implements Serializable{

	
	@Id
	@GeneratedValue
	@Column(name = "user_id", nullable = false)
	private long userId;

	@Column(name = "user_username", nullable = false, length = 30)
	private String username;

	@Column(name = "user_password", nullable = false, length = 20)
	private String password;

	@Column(name = "user_firstname", nullable = false, length = 20)
	private String firstName;

	@Column(name = "user_lastname", nullable = false, length = 20)
	private String lastName;

	@Column(name = "user_validuser")
	private boolean valid;
	
	@ManyToOne
	private Permission permission;
	
	public User() {

	}

	
	
	/*public User(long userId, String username, String password,
			String firstName, String lastName, boolean valid,
			Permission permission) {
		super();
		this.userId = userId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.valid = valid;
		this.permission = permission;
	}*/



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

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public long getUserId() {
		return userId;
	}

	public Permission getPermission() {
		return permission;
	}

	public void setPermission(Permission permission) {
		this.permission = permission;
	}

	
}
