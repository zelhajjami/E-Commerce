package org.zelhajja.ecom.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Category implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategory;
	@NotEmpty
	@Size(min=4,max=20)
	private String catName;
	@Size(min=8)
	private String description;
	@Lob //
	private byte[] photo;
	private String photoName;
	@OneToMany(mappedBy = "category")
	private Collection<Product> products;
	public Long getInCategory() {
		return idCategory;
	}
	public void setInCategory(Long inCategory) {
		this.idCategory = inCategory;
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
