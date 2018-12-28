package com.infiai.webclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@EnableSidecar
@SpringBootApplication
@Controller
public class WebSidecarApplication {
	@Value("${sidecar.port}")
	private String sideCarPort;
	
	@Value("${server.port}")
	private String port;
	
	
	@RequestMapping(value="sideCarPort")
	@ResponseBody
	public String sideCarPort() {
		return sideCarPort+"---"+port;
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WebSidecarApplication.class, args);
	}
}
