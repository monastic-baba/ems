package com.lnt.ems.Service;

import com.lnt.ems.Entity.Machine;

import java.util.List;

public interface MachineService {

    public List<Machine> getMachines();
    public void saveMachine(Machine theMachine);
    public Machine getMachine(int theId);
    public void deleteMachine(int theId);

    public List<Machine> listAvailable();



}
