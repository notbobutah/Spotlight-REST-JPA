/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa.repo;

import com.rrmackay.spotlight.jpa.models.Nodes;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 *
 * @author rob
 */
public interface NodesRepo extends JpaRepository<Nodes, Long> {
 
            
            @Query(value = "SELECT * FROM nodes", nativeQuery = true)
            public List<Nodes> findAll();
}
