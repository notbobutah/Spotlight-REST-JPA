/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;
import com.rrmackay.spotlight.jpa.models.Diagrams;


public interface DiagramsRepo extends JpaRepository<Diagrams, Long> {
    
            @Query(value = "SELECT * FROM diagrams where dname = ?1", nativeQuery = true)
            public Diagrams findByName(String name);    
            
            @Query(value = "SELECT * FROM diagrams", nativeQuery = true)
            public List<Diagrams> findAll();

            @Modifying
            @Query(value = "update diagrams (dname,dbody) VALUES (:dname,:dbody) where id = :id", nativeQuery = true)
            @Transactional
            void updateDiagram(@Param("dname") String dname, @Param("dbody") String dbody, @Param("id") long id);

            @Modifying
            @Query(value = "insert into diagrams (dname,dbody) VALUES (:dname,:dbody)", nativeQuery = true)
            @Transactional
            void insertDiagram(@Param("dname") String dname, @Param("dbody") String dbody);

            @Modifying
            @Query(value = "delete from diagrams where id = :id", nativeQuery = true)
            @Transactional
            void deleteDiagram(@Param("id") long id);
}