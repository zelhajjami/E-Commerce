package org.zelhajja.ecom.entities;

import java.io.Serializable;

public class OrderLine implements Serializable {
	private Long id;
	private Product product;
	private int quantity;
	private double price;
	private Order order;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public OrderLine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderLine(int quantity, double price) {
		super();
		this.quantity = quantity;
		this.price = price;
	}
}
