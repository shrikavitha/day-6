package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="_order")
public class Order {
	
	
		@Id
		@GeneratedValue
		private Long id;
		private Long orderNumber;
		
		public Order() {
			super();
		}
		public Order(Long id, Long orderNumber) {
			super();
			this.id = id;
			this.orderNumber = orderNumber;
		}
		public Long getId() {
			return id;
		}
		public void setId(Long id) {
			this.id = id;
		}
		public Long getOrderNumber() {
			return orderNumber;
		}
		public void setOrderNumber(Long orderNumber) {
			this.orderNumber = orderNumber;
		}

	}