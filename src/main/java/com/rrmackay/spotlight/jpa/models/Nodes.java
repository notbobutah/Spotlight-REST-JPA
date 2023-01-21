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
@Table(name = "nodes")
public class Nodes {

        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        @Column(name = "offsetX")
	private long offsetX;

        @Column(name = "offsetY")
	private long offsetY;

        @Column(name = "nodebody")
	private String nodebody;

	public Nodes() {

	}

	public Nodes(Long X, Long Y, String dbody) {
		this.offsetX = X;
                this.offsetY = Y;
		this.nodebody = dbody;
	}

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getOffsetX() {
            return offsetX;
        }

        public void setOffsetX(long offsetX) {
            this.offsetX = offsetX;
        }

        public long getOffsetY() {
            return offsetY;
        }

        public void setOffsetY(long offsetY) {
            this.offsetY = offsetY;
        }

        public String getNodebody() {
            return nodebody;
        }

        public void setNodebody(String nodebody) {
            this.nodebody = nodebody;
        }


	@Override
	public String toString() {
		return "Node [id=" + id + ", X=" + offsetX + " Y=" + offsetY + " body=" + nodebody + "]";
	}
}