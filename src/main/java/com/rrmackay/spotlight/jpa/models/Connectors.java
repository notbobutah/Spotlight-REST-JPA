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
public class Connectors {
 
        @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

        @Column(name = "sourcenode")
	private long sourcenode;

        @Column(name = "targetnode")
	private long targetnode;

        @Column(name = "connectorbody")
	private String connectorbody;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public long getSourcenode() {
            return sourcenode;
        }

        public void setSourcenode(long sourcenode) {
            this.sourcenode = sourcenode;
        }

        public long getTargetnode() {
            return targetnode;
        }

        public void setTargetnode(long targetnode) {
            this.targetnode = targetnode;
        }

        public String getConnectorbody() {
            return connectorbody;
        }

        public void setConnectorbody(String connectorbody) {
            this.connectorbody = connectorbody;
        }



        @Override
        public String toString() {
            return "Connectors{" + "id=" + id + ", sourcenode=" + sourcenode + ", targetnode=" + targetnode + ", connectorbody=" + connectorbody + '}';
        }

       
}
