package com.infosys.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Payment")

public class Payment {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentid;
	
	@Column(name = "paymentstatus")
	private String paymentStatus;
	
	@Column(name = "transactionId")
	private String transactionId;
	
	
	public Payment(int paymentid, String paymentStatus, String transactionId) {
		super();
		this.paymentid = paymentid;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
	}
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	
}
