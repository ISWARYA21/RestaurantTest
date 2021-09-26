package com.testapp.entity;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
	@Entity
	@Table(name = "OrderDetails")
	public class OrderDetails {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "OrderId")
		private int orderId;
		@Column(name = "orderDate")
		private LocalDateTime orderDate;
		//@Column(name = "cart")
		//private FoodCart cart;
		
		@Column(name = "orderStatus")
		private String orderStatus;
		
		public int getOrderId() 
		{
			return orderId;
		}
		public void setOrderId(int orderId) 
		{
			this.orderId = orderId;
		}
		public LocalDateTime getOrderDate() 
		{
			return orderDate;
		}
		public void setOrderDate(LocalDateTime orderDate)
		{
			this.orderDate = orderDate;
		}
		/*public FoodCart getCart()
		{
			return cart;
		}
		public void setCart(FoodCart cart) 
		{
			this.cart = cart;
		}*/
		public String getOrderStatus() 
		{
			return orderStatus;
		}
		public void setOrderStatus(String orderStatus)
		{
			this.orderStatus = orderStatus;
		}
	}