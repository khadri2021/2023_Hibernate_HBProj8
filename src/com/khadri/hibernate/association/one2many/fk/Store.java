package com.khadri.hibernate.association.one2many.fk;

public class Store {

	private String uuid;
	private String name;
	private String location;
	private int gstNumber;
	private Merchant merchant;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getGstNumber() {
		return gstNumber;
	}

	public void setGstNumber(int gstNumber) {
		this.gstNumber = gstNumber;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
}
