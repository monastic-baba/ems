package com.lnt.ems.Service;

import java.util.List;

import com.lnt.ems.DAO.MachineDAO;
import com.lnt.ems.Entity.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class MachineServiceImpl implements MachineService {

    // need to inject Machine DAO
    @Autowired
    private MachineDAO machineDAO;

    @Override
    @Transactional
    public List<Machine> getMachines(){
        return machineDAO.getMachines();
    }

    @Override
    @Transactional
    public void saveMachine(Machine theMachine){
        machineDAO.saveMachine(theMachine);
    }

    @Override
    @Transactional
    public Machine getMachine(int theId) {

        return machineDAO.getMachine(theId);
    }

    @Override
    @Transactional
    public void deleteMachine(int theId) {

        machineDAO.deleteMachine(theId);
    }

    @Override
    public List<Machine> listAvailable() {
        return machineDAO.listAvailable();
    }
}
