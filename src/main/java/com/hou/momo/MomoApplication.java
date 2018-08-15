package com.hou.momo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MomoApplication {

	public static void main(String[] args) {
		new WebSocketServer(8080).run();
		SpringApplication.run(MomoApplication.class, args);
	}
}
