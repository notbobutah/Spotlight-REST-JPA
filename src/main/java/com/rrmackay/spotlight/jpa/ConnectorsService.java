/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rrmackay.spotlight.jpa;

import com.rrmackay.spotlight.jpa.repo.ConnectorsRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import com.rrmackay.spotlight.jpa.models.Connectors;
//import com.rrmackay.spotlight.jpa.;

public class ConnectorsService {
    
    @Autowired
    private ConnectorsRepo connectorsRepository;

    @Transactional(readOnly = true)
    public List<Connectors> getAllConnectors() {
        return connectorsRepository.findAll();
    }

    
}
