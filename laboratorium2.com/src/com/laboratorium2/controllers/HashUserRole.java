package com.laboratorium2.controllers;

import javax.persistence.*;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="HashUserRole")
public class HashUserRole {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	@Column(name="userid")
	@NotEmpty
	public int userid;
	@Column(name="roleid")
	@NotEmpty
	public int roleid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
}
