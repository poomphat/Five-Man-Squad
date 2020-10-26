package com.microservices.servicediscovery.controller;

import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CheckWebSiteStatus implements HealthIndicator{

	@Override
	public Health health() {
		try {
			URL siteURL = new URL("http://desktop-6jffnqv:8083/actuator/info/");
			HttpURLConnection connection = (HttpURLConnection)siteURL.openConnection();
			connection.setRequestMethod("GET");
			connection.connect();
			int code = connection.getResponseCode();
			if (code == 200) {
				return Health.up().build();
			}
			else {
				return Health.down().withDetail("Error", "Service is down").build();
			}
		}
		catch(Exception e) {
			return Health.down().withDetail("Error", "Service Unavailable").build();
		}
	}

}