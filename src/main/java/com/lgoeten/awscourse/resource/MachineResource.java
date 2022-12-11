package com.lgoeten.awscourse.resource;

import com.lgoeten.awscourse.entity.DetailedMachine;
import com.lgoeten.awscourse.entity.Machine;
import com.lgoeten.awscourse.service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/machines")
public class MachineResource {

    @Autowired
    private MachineService machineService;

    @GetMapping("/basic")
    public ResponseEntity<Machine> getMachineInformation(){
        return ResponseEntity.ok(machineService.getMachineInformation());
    }

    @GetMapping("/detailed")
    public ResponseEntity<DetailedMachine> getDetailedMachineInformation(){
        return ResponseEntity.ok(machineService.getDetailedMachineInformation());
    }
}
