package com.accenture.graphQl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.graphQl.model.Order;
import com.accenture.graphQl.repo.OrderRepo;

@Service
public class OrderService {

	
@Autowired
private OrderRepo repo;


public Order saveOrder(Order order) {
	return repo.save(order);
}

public List<Order> getAllOrders(){
	return repo.findAll();
}
}
