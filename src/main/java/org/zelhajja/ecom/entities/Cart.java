package org.zelhajja.ecom.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Cart implements Serializable{
	private Map<Long, OrderLine> items = new HashMap<Long, OrderLine>();
	
	public void addItem(Product p, int quantity){
		if(items.get(p.getIdProduct()) == null){
			OrderLine ol = new OrderLine();
			ol.setProduct(p);
			ol.setQuantity(quantity);
			ol.setPrice(p.getPrice());
		}
		else {
			OrderLine ol = items.get(p.getIdProduct());
			ol.setQuantity(ol.getQuantity()+quantity);
		}
	}
	
	public Collection<OrderLine> getItems(){
		return items.values();
	}
	
	public double getTotal() {
		double total=0;
		for(OrderLine ol: items.values()){
			total+=ol.getPrice()*ol.getQuantity();
		}
		return total;
	}
	
	public int getSize(){
		return items.size();
	}
	
	public void deleteItem(Long idProduct){
		items.remove(idProduct);
	}
	
}
