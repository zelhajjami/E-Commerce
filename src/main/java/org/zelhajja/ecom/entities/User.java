package org.zelhajja.ecom.entities;

import java.io.Serializable;
import java.util.Collection;

public class User implements Serializable{
	private Long idUser;
	private String username;
	private String password;
	private boolean activated;
	private Collection<Role> roles;
}
