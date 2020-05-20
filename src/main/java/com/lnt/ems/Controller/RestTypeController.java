package com.lnt.ems.Controller;

import com.lnt.ems.Entity.Engineer;
import com.lnt.ems.Service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestTypeController {

    private EngineerService theengineerService;

    @Autowired
    public RestTypeController(EngineerService engineerService){
        theengineerService = engineerService;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/")
    public List<Engineer> healthCheck()
    {
        return theengineerService.getEngineers();
    }

    
}
