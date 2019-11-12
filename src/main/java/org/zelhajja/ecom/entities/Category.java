package org.zelhajja.ecom.entities;

import java.io.Serializable;
import java.util.Collection;

public class Category implements Serializable{
	private Long inCategory;
	private String catName;
	private String description;
	private byte[] photo;
	private String photoName;
	private Collection<Product> products;
	public Long getInCategory() {
		return inCategory;
	}
	public void setInCategory(Long inCategory) {
		this.inCategory = inCategory;
	}
	public String getCatName() {
		return catName;
	}
	public void setCatName(String catName) {
		this.catName = catName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public String getPhotoName() {
		return photoName;
	}
	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}
	public Collection<Product> getProducts() {
		return products;
	}
	public void setProducts(Collection<Product> products) {
		this.products = products;
	}
	public Category(String catName, String description, byte[] photo, String photoName) {
		super();
		this.catName = catName;
		this.description = description;
		this.photo = photo;
		this.photoName = photoName;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
