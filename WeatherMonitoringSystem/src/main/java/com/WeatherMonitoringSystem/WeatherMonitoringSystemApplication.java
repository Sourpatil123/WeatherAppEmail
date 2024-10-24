package com.WeatherMonitoringSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.WheatherMonitoringSystem.Reposotories")
@SpringBootApplication(scanBasePackages = "com.WheatherMonitoringSystems")
public class WeatherMonitoringSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherMonitoringSystemApplication.class, args);
	}

}
