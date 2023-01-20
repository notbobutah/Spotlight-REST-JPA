/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.rest;


import java.util.List;
import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import com.rrmackay.spotlight.jpa.DiagramsRepo;
import com.rrmackay.spotlight.jpa.models.Diagrams;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("api/")
public class DiagramRest {
    
        @Autowired
        DiagramsRepo diagramsRepo;
	
	@RequestMapping("/diagrams")
	public ResponseEntity<List<Diagrams>> getDiagrams() {
                List<Diagrams> dlist = new ArrayList<Diagrams>();
                dlist = diagramsRepo.findAll();
                
		return new ResponseEntity<>(dlist, HttpStatus.OK);
	}

	@GetMapping("/nodes")
	public String getNodes() {
		return "[ node:{ name: test }]";
	}
	@GetMapping("/connectors")
	public String getConnectors() {
		return "[ connector:{ name: test }]";
	}
}