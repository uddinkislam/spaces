package com.spaces.portal.login.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name="USERS")
public class User {
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private long userID;
	@JsonProperty("userType")
	@Column(name="user_type")
	private String userType;
	@Column(name="first_name")
	@JsonProperty("fName")
	private String fName;
	@JsonProperty("lName")
	@Column(name="last_name")
	private String lName;
	@JsonProperty("email")
	@Column(name="email")
	private String email;
	@JsonProperty("userName")
	@Column(name="user_name")
	private String userName;
	@JsonProperty("password")
	@Column(name="password")
	private String password;

}
