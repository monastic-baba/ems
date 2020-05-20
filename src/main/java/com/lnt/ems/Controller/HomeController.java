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
public class HomeController {

    @RequestMapping("/hello")
    public String hello() {
        return "index";
    }

    @RequestMapping("/welcome")
    public String welcome() {
        return "bootstrap";
    }



}
