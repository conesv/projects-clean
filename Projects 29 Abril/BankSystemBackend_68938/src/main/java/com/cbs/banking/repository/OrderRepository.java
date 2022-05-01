package com.cbs.banking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cbs.banking.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
