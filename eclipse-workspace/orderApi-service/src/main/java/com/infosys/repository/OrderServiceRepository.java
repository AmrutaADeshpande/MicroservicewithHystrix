package com.infosys.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Order;
@Repository
public interface OrderServiceRepository extends JpaRepository<Order,Integer>{

}
 