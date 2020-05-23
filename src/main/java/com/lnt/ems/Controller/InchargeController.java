package com.lnt.ems.Controller;

import com.lnt.ems.Entity.Engineer;
import com.lnt.ems.Entity.Machine;
import com.lnt.ems.Service.EngineerService;
import com.lnt.ems.Service.MachineService;
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

    @Autowired
    private MachineService machineService;

    @RequestMapping("")
    public String helloIncharge() {
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

        return  "redirect:/admin/listEngineers";
    }

    @PostMapping("/saveEngineer")
    public String saveEngineer(@ModelAttribute("engineer") Engineer theEngineer){

        engineerService.saveEngineer(theEngineer);

        return  "redirect:/admin/listEngineers";
    }

    @RequestMapping("/addOrDeleteMachine")
    public String machineAddForm(Model theModel){

        Machine newMachine = new Machine();

        theModel.addAttribute("machine", newMachine);

        return "machine-form";
    }

    @PostMapping("/deleteMachine")
    public String deleteMachine(@ModelAttribute("machine") Machine theMachine){

        machineService.deleteMachine(theMachine.getId());

        return  "redirect:/admin/listMachines";
    }

    @PostMapping("/saveMachine")
    public String saveMachine(@ModelAttribute("machine") Machine theMachine){

        machineService.saveMachine(theMachine);

        return  "redirect:/admin/listMachines";
    }




}
