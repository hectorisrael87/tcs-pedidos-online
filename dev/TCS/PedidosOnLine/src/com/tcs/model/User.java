package com.tcs.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name = "user")
public  class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "user_username", nullable = false, length=30)
	private String username;
	
	@Column(name = "user_password", nullable = false, length=20)
	private String password;
	
	@Column(name = "user_firstname", nullable = false, length=20)
	private String firstName;
	
	@Column(name = "user_lastname", nullable = false, length=20)
	private String lastName;
	
	@Column(name = "user_validuser")
	private boolean valid;
	
	@Column(name = "user_type")
	private boolean type;
	
	/*@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	// EAGER indica que al momento de recuperar de la base de datos al pedido se trae a todas las relaciones
	private List<Order> order = new ArrayList<Order>();*/

	public User() {
		
	}

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

	public boolean isType() {
		return type;
	}

	public void setType(boolean type) {
		this.type = type;
	}

	public long getUserId() {
		return userId;
	}
	
	

	
	
	
	

}
