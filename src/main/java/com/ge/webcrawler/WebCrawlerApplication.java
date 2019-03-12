package com.ge.webcrawler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ge.webcrawler.service.WebCrawlerService;

@SpringBootApplication
public class WebCrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebCrawlerApplication.class, args);
		WebCrawlerService webCrawlerService=new WebCrawlerService();
		webCrawlerService.startWebCrawler();
	}

}
