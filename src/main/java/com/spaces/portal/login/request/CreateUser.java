package com.spaces.portal.login.request;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USERS")
public class CreateUser {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id()
	@Column(name="id")
	private String userID;
	@Column(name="user_type")
	private String userType;
	@Column(name="first_name")
	private String fName;
	@Column(name="last_name")
	private String lName;
	@Column(name="email")
	private String email;
	@Column(name="user_name")
	private String userName;
	@Column(name="password")
	private String password;
	
	


}
