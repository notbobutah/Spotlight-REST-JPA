/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.rrmackay.spotlight.jpa.repo;

import com.rrmackay.spotlight.jpa.models.Connectors;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ConnectorsRepo extends JpaRepository<Connectors, Long>{
    
            
            @Query(value = "SELECT * FROM connectors", nativeQuery = true)
            public List<Connectors> findAll();

            @Modifying
            @Query(value = "update diagrams (sourcenode,targetnode,connectorbody) VALUES (:sourcenode,:targetnode,:connectorbody) where id = :id", nativeQuery = true)
            @Transactional
            void updateConnector(@Param("sourcenode") long sourcenode, @Param("targetnode") long targetnode, @Param("connectorbody") String connectorbody,@Param("id") String id);

            @Modifying
            @Query(value = "insert into diagrams (sourcenode,targetnode,connectorbodyy) VALUES (:sourcenode,:targetnode,:connectorbody)", nativeQuery = true)
            @Transactional
            void insertConnector(@Param("sourcenode") long sourcenode, @Param("targetnode") long targetnode, @Param("connectorbody") String connectorbody);

            @Modifying
            @Query(value = "delete from diagrams where id = :id", nativeQuery = true)
            @Transactional
            void deleteConnector(@Param("id") String id);

}

