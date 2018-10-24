package com.klikatech.example.speaker;

import com.google.auto.service.AutoService;
import com.klikatech.example.api.Speaker;

@AutoService(Speaker.class)
public class German implements Speaker {

	@Override
	public String sayHello(String name) {
		return String.format("Hallo, %s", name);
	}

}
