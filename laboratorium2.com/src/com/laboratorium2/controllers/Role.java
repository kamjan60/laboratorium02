package com.laboratorium2.controllers;

import javax.persistence.*;
import org.hibernate.validator.constraints.NotEmpty;

@SuppressWarnings("deprecation")
@Entity
@Table(name="Role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@NotEmpty
	@Column(name="Nazwa_roli",unique=true)
	public String rolename;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
}
