package com.trendytechie.micorservices.springcloudconfligclient.controller;

import com.trendytechie.micorservices.springcloudconfligclient.beans.ConfiguredProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/configuration")
public class AccessController {

//    @Autowired
//    private ConfiguredProperties properties;
@Value("${trendytechie.role: Default Value}")
private String role;

    @GetMapping("/cc")
    public String configuration(){
        return "Role: "+ role;
    }
}
