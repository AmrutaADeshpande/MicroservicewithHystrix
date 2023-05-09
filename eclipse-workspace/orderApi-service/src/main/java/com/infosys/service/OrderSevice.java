package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.entity.Order;
import com.infosys.repository.OrderServiceRepository;

@Service
public class OrderSevice {

	@Autowired
	private OrderServiceRepository orderRepository;
	
	public Order saveOrder(Order order)
	{
		return orderRepository.save(order);
	}
	
	

}
