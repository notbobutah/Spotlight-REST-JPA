/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa.models;

import javax.persistence.*;

import javax.persistence.Entity;
//import javax.persistence.Data;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "diagrams")
public class Diagrams {

        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "dname")
	private String dname;

        @Column(name = "dbody")
	private String dbody;

	public Diagrams() {

	}

	public Diagrams(String dname, String dbody) {
		this.dname = dname;
		this.dbody = dbody;
	}

	public long getId() {
		return id;
	}

	public String getdname() {
		return dname;
	}

	public void setdname(String dname) {
		this.dname = dname;
	}

	public String getdbody() {
		return dbody;
	}

	public void setdbody(String dbody) {
		this.dbody = dbody;
	}

	@Override
	public String toString() {
		return "Diagram [id=" + id + ", name=" + dname + ", dbody=" + dbody + "]";
	}
}