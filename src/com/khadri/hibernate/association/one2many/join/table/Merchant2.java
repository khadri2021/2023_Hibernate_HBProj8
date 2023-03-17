package com.khadri.hibernate.association.one2many.join.table;

import java.util.Set;

public class Merchant2 {

	private String uuid;
	private String name;
	private String owner;
	private Set<Store2> stores;

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public Set<Store2> getStores() {
		return stores;
	}

	public void setStores(Set<Store2> stores) {
		this.stores = stores;
	}

}
