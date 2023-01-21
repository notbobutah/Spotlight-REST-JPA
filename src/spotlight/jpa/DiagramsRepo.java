/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

import javax.persistence.*;
import com.rrmackay.spotlight.jpa.models.Diagrams;


public interface DiagramsRepo extends JpaRepository<Diagrams, Long> {
    
            @Query(value = "SELECT * FROM diagrams where dname = ?1", nativeQuery = true)
            public Diagrams findByName(String name);    
            
            @Query(value = "SELECT * FROM diagrams", nativeQuery = true)
            public List<Diagrams> findAll();
}
