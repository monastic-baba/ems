package com.lnt.ems.Controller;

import com.lnt.ems.DAO.EngineerDAOImpl;
import com.lnt.ems.Entity.Engineer;
import com.lnt.ems.Service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class HomeController {


    private EngineerService es;

    @Autowired
    public HomeController(EngineerService es1){
        es = es1;
    }

    @RequestMapping(method = RequestMethod.GET,value = "/")
    public List<Engineer> healthCheck(HttpServletRequest req)
    {
        return es.getEngineers();
    }


}
