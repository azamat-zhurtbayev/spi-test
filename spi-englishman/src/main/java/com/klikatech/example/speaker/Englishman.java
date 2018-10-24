package com.klikatech.example.speaker;

import com.klikatech.example.api.Speaker;

public class Englishman implements Speaker {

	@Override
	public String sayHello(String name) {
		return String.format("Hello, %s", name);
	}

}
