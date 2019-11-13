package org.zelhajja.ecom.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
public class CustomerOrder implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idOrder;
	private Date dateOrder;
	@OneToMany (mappedBy = "order")
	private Collection<OrderLine> items;
	@ManyToOne
	@JoinColumn(name = "idCustomer")
	private Customer customer;
	public Long getIdOrder() {
		return idOrder;
	}
	public void setIdOrder(Long idOrder) {
		this.idOrder = idOrder;
	}
	public Date getDateOrder() {
		return dateOrder;
	}
	public void setDateOrder(Date dateOrder) {
		this.dateOrder = dateOrder;
	}
	public Collection<OrderLine> getItems() {
		return items;
	}
	public void setItems(Collection<OrderLine> items) {
		this.items = items;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setClient(Customer customer) {
		this.customer = customer;
	}
	public CustomerOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
