package com.trendytechie.micorservices.springcloudconfligclient;

import com.trendytechie.micorservices.springcloudconfligclient.beans.ConfiguredProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@EnableWebMvc
@SpringBootApplication
public class TrendytechieSpringCloudConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendytechieSpringCloudConfigClientApplication.class, args);
	}



}
