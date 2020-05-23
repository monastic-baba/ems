package com.lnt.ems.Controller;

import com.lnt.ems.Entity.Request;
import com.lnt.ems.Service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class EngineerController {

    @Autowired
    private RequestService requestService;


    @RequestMapping("")
    public String helloEngineer() {
        return "engineer-home";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "bootstrap";
    }

    @RequestMapping("/newRequest")
    public String newRequestForm(Model theModel){

        Request newRequest = new Request();

        theModel.addAttribute("request", newRequest);

        return "newrequest-form";
    }


    @PostMapping("/createRequest")
    public String createRequest(@ModelAttribute("request") Request theRequest){

        requestService.createRequest(theRequest);

        return  "redirect:/user";
    }




}
