package org.zelhajja.ecom.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCustomer;
	private String customerName;
	private String adress;
	private String email;
	private String phoneNumber;
	@OneToMany(mappedBy = "customer")
	private Collection<CustomerOrder> orders;
	public Long getIdCustomer() {
		return idCustomer;
	}
	public void setIdCustomer(Long idClient) {
		this.idCustomer = idClient;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(String customerName, String adress, String email) {
		super();
		this.customerName = customerName;
		this.adress = adress;
		this.email = email;
	}
	
}
