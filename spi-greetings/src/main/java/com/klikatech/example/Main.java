package com.klikatech.example;

import com.klikatech.example.api.Speaker;

import java.util.ServiceLoader;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Main {

	private static ServiceLoader<Speaker> speakerServiceLoader = ServiceLoader.load(Speaker.class);

	public static void main(String[] args) {
		String name = (args.length > 0) ? Stream.of(args).collect(Collectors.joining(" ")) : "world";
		speakerServiceLoader.reload();
		StreamSupport.stream(
							speakerServiceLoader.spliterator(), false
						).map(s -> s.sayHello(name))
						.forEach(System.out::println);
	}

}
