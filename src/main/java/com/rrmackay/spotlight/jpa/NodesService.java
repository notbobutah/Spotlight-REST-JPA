/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa;

import com.rrmackay.spotlight.jpa.repo.NodesRepo;
import com.rrmackay.spotlight.jpa.models.Nodes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class NodesService {
    
    @Autowired
    private NodesRepo nodesRepository;

    @Transactional(readOnly = true)
    public List<Nodes> getAllNodes() {
        return nodesRepository.findAll();
    }

}