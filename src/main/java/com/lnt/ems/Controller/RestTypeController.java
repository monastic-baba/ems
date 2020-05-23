package com.lnt.ems.Controller;

import com.lnt.ems.Entity.Engineer;
import com.lnt.ems.Entity.Machine;
import com.lnt.ems.Service.EngineerService;
import com.lnt.ems.Service.MachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestTypeController {

    private EngineerService theEngineerService;
    private MachineService theMachineService;

    @Autowired
    public RestTypeController(EngineerService engineerService, MachineService machineService){
        theEngineerService = engineerService;
        theMachineService = machineService;
    }


    @RequestMapping(method = RequestMethod.GET,value = "/admin/listEngineers")
    public List<Engineer> listengineers()
    {
        return theEngineerService.getEngineers();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/admin/listMachines")
    public List<Machine> listmachines()
    {
        return theMachineService.getMachines();
    }

    
}
