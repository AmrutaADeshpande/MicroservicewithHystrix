package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infosys.entity.Order;
import com.infosys.service.OrderSevice;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@Autowired
	private OrderSevice orderService;
	
	
	@PostMapping("/Bookorders")
	public Order bookOrder(@RequestBody Order order)
	
	{
		return orderService.saveOrder(order);
		
	}
	

}
