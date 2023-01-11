package com.model;


import java.util.Date;

public class Order {

	private int orderId;
	private String material;
	private int quantity;
	private double totAmount;
	private String siteName;
	private String siteAddress;
	private Date orderDate;
	private String deliveryDate;

	// Constructor
	public Order(String material, int quantity, double totAmount, String siteName, String siteAddress,
			String deliveryDate) {
		
		this.material = material;
		this.quantity = quantity;
		this.totAmount = totAmount;
		this.siteName = siteName;
		this.siteAddress = siteAddress;
		this.deliveryDate = deliveryDate;
	}

	public Order(int orderId, String material, int quantity, double totAmount, String siteName, String siteAddress,
			Date orderDate, String deliveryDate) {

		this.orderId = orderId;
		this.material = material;
		this.quantity = quantity;
		this.totAmount = totAmount;
		this.siteName = siteName;
		this.siteAddress = siteAddress;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
	}
	
	public Order() {
	}

	// Setters
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setTotAmount(double totAmount) {
		this.totAmount = totAmount;
	}

	public void setSiteName(String siteName) {
		this.siteName = siteName;
	}

	public void setSiteAddress(String siteAddress) {
		this.siteAddress = siteAddress;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public void setDeliveryDate(String deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	// Getters
	public int getOrderId() {
		return orderId;
	}


	public String getMaterial() {
		return material;
	}


	public int getQuantity() {
		return quantity;
	}


	public double getTotAmount() {
		return totAmount;
	}


	public String getSiteName() {
		return siteName;
	}


	public String getSiteAddress() {
		return siteAddress;
	}


	public Date getOrderDate() {
		return orderDate;
	}


	public String getDeliveryDate() {
		return deliveryDate;
	}

}
