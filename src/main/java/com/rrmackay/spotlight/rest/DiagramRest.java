/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.rest;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/")
public class DiagramRest {
	
	@RequestMapping("/diagrams")
	public String getDiagrams() {
		return "][ diagram:{ name: test }]";
	}

	@RequestMapping("/nodes")
	public String getNodes() {
		return "[ node:{ name: test }]";
	}
	@RequestMapping("/connectors")
	public String getConnectors() {
		return "[ connector:{ name: test }]";
	}
}