package com.example.paypalpayment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.paypalpayment.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
