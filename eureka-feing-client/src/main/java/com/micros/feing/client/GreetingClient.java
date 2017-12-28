package com.micros.feing.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.micros.feing.client.impl.GreetingClientImpl;

@FeignClient(name = "greeting-service", fallback = GreetingClientImpl.class)
public interface GreetingClient {

	@RequestMapping("/greeting")
	String greeting();
}
