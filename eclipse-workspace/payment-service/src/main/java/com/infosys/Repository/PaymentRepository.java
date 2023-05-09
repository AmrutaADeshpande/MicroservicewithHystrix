package com.infosys.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infosys.entity.Payment;


@Repository
public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
 
