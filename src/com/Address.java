package com;

public class Address {
	int houseNumber;
	String street;
	String pin;

	public int getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public Address(int houseNumber, String street, String pin) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.pin = pin;
	}

	public Address() {
		super();
	}

}