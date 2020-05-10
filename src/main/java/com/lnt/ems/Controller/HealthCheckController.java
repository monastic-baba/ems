package com.lnt.ems.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HealthCheckController {

//    private static final Logger LOGGER = LoggerFactory.getLogger(HealthCheckController.class);

    @RequestMapping(method = RequestMethod.GET,value = "/")
    public String healthCheck(HttpServletRequest req)
    {
//        LOGGER.info("Routing Engine Health check request received.");

        return "Checking Health.....";
    }

}
