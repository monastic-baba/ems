package com.lnt.ems.Controller;

import com.lnt.ems.Entity.Engineer;
import com.lnt.ems.Service.EngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/admin")
public class InchargeController {

    @Autowired
    private EngineerService engineerService;

    @RequestMapping("/")
    public String hello() {
        return "incharge-home";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "bootstrap";
    }

    @RequestMapping("/addOrDeleteEngineer")
    public String engineerAddForm(Model theModel){

        Engineer newEngineer = new Engineer();

        theModel.addAttribute("engineer", newEngineer);

        return "engineer-form";

    }

    @PostMapping("/deleteEngineer")
    public String deleteEngineer(@ModelAttribute("engineer") Engineer theEngineer){

        engineerService.deleteEngineer(theEngineer.getId());

        return  "redirect:/list";
    }

    @PostMapping("/saveEngineer")
    public String saveEngineer(@ModelAttribute("engineer") Engineer theEngineer){

        engineerService.saveEngineer(theEngineer);

        return  "redirect:/list";
    }




}
