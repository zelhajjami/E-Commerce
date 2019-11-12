package org.zelhajja.ecom.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

public class Order implements Serializable {
	private Long idOrder;
	private Date dateOrder;
	private Collection<OrderLine> items;
	private Client client;
}
