package com.accenture.graphQl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.accenture.graphQl.model.Order;

@Repository
public interface OrderRepo extends JpaRepository<Order, Integer>{

}
