package com.micros.feing.client.impl;

import org.springframework.stereotype.Component;

import com.micros.feing.client.GreetingClient;

@Component
public class GreetingClientImpl implements GreetingClient {

	@Override
	public String greeting() {
		return "fallback handling service";
	}

}
