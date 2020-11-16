package com.example.DistributedComputing.Controllers;

import com.example.DistributedComputing.Configuration.Configuration;
import com.example.DistributedComputing.Models.DistributingComputingConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DistributingComputingController {

    @Autowired
    private Configuration configuration;

    @Autowired
    private Environment environment;

    @GetMapping("distributing-computing")
    public DistributingComputingConfiguration getDistributingConfiguration(){
        return new DistributingComputingConfiguration(configuration.getValue1(),configuration.getValue2(), Integer.parseInt(environment.getProperty("local.server.port")));
    }
}
