/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa.repo;

import com.rrmackay.spotlight.jpa.models.Nodes;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author rob
 */
public interface NodesRepo extends JpaRepository<Nodes, Long> {
 
            
            @Query(value = "SELECT * FROM nodes", nativeQuery = true)
            public List<Nodes> findAll();

            @Modifying
            @Query(value = "update nodes (offsetX, offsetY, nodebody) VALUES (:offsetX, :offsetY, :nodebody) where id = :id", nativeQuery = true)
            @Transactional
            void updateNodes(@Param("offsetX") long offsetX,@Param("offsetY") long offsetY, @Param("nodebody") String nodebody, @Param("id") long id);

            @Modifying
            @Query(value = "insert into nodes (offsetX, offsetY, nodebody) VALUES (:offsetX, :offsetY, :nodebody)", nativeQuery = true)
            @Transactional
            void insertNodes(@Param("offsetX") long offsetX,@Param("offsetY") long offsetY, @Param("nodebody") String nodebody);

            @Modifying
            @Query(value = "delete from nodes where id = :id", nativeQuery = true)
            @Transactional
            void deleteNodes(@Param("id") long id);

}
