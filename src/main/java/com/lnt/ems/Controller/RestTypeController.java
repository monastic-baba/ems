package com.lnt.ems.Controller;

import com.lnt.ems.Entity.Engineer;
import com.lnt.ems.Entity.Machine;
import com.lnt.ems.Entity.Request;
import com.lnt.ems.Service.EngineerService;
import com.lnt.ems.Service.MachineService;
import com.lnt.ems.Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestTypeController {

    private EngineerService theEngineerService;
    private MachineService theMachineService;
    private RequestService theRequestService;

    @Autowired
    public RestTypeController(EngineerService engineerService, MachineService machineService, RequestService requestService){
        theEngineerService = engineerService;
        theMachineService = machineService;
        theRequestService = requestService;
    }


    @RequestMapping(method = RequestMethod.GET,value = "/admin/listEngineers")
    public List<Engineer> listengineers() {
        return theEngineerService.getEngineers();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/admin/listMachines")
    public List<Machine> listmachines() {
        return theMachineService.getMachines();
    }

    @RequestMapping(method = RequestMethod.GET,value = "/user/myRequests/{engineerId}")
    public List<Request> myrequests(@PathVariable int engineerId) {
        return theRequestService.listRequested(engineerId);
    }

    @RequestMapping(method = RequestMethod.GET,value = "/user/availableMachines")
    public List<Machine> availableMachines() {
        return theMachineService.listAvailable();
    }

    
}
