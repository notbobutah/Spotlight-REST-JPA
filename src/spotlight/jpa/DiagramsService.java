/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa;


import com.rrmackay.spotlight.jpa.DiagramsRepo;
import com.rrmackay.spotlight.jpa.models.Diagrams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * User: Quinten
 * Date: 29-4-2014
 * Time: 17:04
 *
 * @author Quinten De Swaef
 */
@Service
@Transactional
public class DiagramsService {

    @Autowired
    private DiagramsRepo diagramsRepository;

    @Transactional(readOnly = true)
    public List<Diagrams> getAllDiagrams() {
        return diagramsRepository.findAll();
    }
    @Transactional(readOnly = true)
    public Diagrams getDiagramsByName(String name) {
        return diagramsRepository.findByName(name);
    }

}