package com.khadri.hibernate.association.one2one.pk;

public class Citizen {

	private String uuid;
	private String name;
	private Integer age;
	private AdhaarCard adhaarCard;

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

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public AdhaarCard getAdhaarCard() {
		return adhaarCard;
	}

	public void setAdhaarCard(AdhaarCard adhaarCard) {
		this.adhaarCard = adhaarCard;
	}

}
