package io.github.dorma.webrtc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
public class Application {

	static {
		System.setProperty("spring.config.location", "classpath:/application.yml,classpath:/application-aws.yml");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}