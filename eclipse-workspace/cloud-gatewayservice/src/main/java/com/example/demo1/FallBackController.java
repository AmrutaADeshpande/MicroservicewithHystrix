package com.example.demo1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
	@RequestMapping("/orderFallBack")
	public Mono<String> orderServiceFallBack()
	{
		return Mono.just("order service fallback");
		
	}
	
	
	@RequestMapping("/paymentFallBack")
	public Mono<String> paymentServiceFallBack()
	{
		return Mono.just("payment service fallback");
		
	}

}
