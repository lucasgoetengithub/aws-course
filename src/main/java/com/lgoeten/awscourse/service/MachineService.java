package com.lgoeten.awscourse.service;

import com.lgoeten.awscourse.entity.DetailedMachine;
import com.lgoeten.awscourse.entity.Machine;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Service
public class MachineService {


    public Machine getMachineInformation() throws UnknownHostException {
        InetAddress address = InetAddress.getLocalHost();
        String ip = address.getHostAddress();
        String name = address.getHostName();
        String os = System.getProperty("os.name");
        String architecture = System.getProperty("os.arch");
        String osVersion = System.getProperty("os.version");

        return new Machine(ip, name, os, architecture, osVersion);
    }


    public DetailedMachine getDetailedMachineInformation() throws UnknownHostException {
        Machine machine = getMachineInformation();

        String javaVersion = System.getProperty("java.version");
        String javaVendor = System.getProperty("java.vendor");
        String javaVendorUrl = System.getProperty("java.vendor.url");

        return new DetailedMachine(machine.getIp(), machine.getName(), machine.getOs(), machine.getArchitecture(), machine.getOsVersion(), javaVersion, javaVendor, javaVendorUrl);
    }
}
