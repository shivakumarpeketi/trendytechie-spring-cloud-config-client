package com.trendytechie.micorservices.springcloudconfligclient.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class ConfiguredProperties {

    @Value("${trendytechie.role: Default}")
	private String role;
	@Value("${trendytechie.description: Default desc}")
	private String description;
}
