package io.github.dorma.webrtc;

import io.github.dorma.webrtc.property.FileStorageProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.socket.config.annotation.EnableWebSocket;

@SpringBootApplication
@EnableWebSocket
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class Application {

	static {
		System.setProperty("spring.config.location", "classpath:/application.yml,classpath:/application-aws.yml");
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("https://class.dormabook.shop");
				registry.addMapping("/**").allowedOrigins("https://dormabook.shop");
			}
		};
	}
}
