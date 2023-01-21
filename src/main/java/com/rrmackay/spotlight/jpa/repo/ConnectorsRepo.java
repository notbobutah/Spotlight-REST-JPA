/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rrmackay.spotlight.jpa.repo;

import com.rrmackay.spotlight.jpa.models.Connectors;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ConnectorsRepo extends JpaRepository<Connectors, Long>{
    
            
            @Query(value = "SELECT * FROM connectors", nativeQuery = true)
            public List<Connectors> findAll();
}

