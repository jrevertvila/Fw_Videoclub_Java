package modules.users.classes;

import classes.Date;

public abstract class User {
	// Attributes
	String name;
	String surnames;
	String city;
	String postalCode;
	String address;
	String email;
	Date fnac;
	int tlf;
	int age;

	public User(String name, String surnames, String city, String postalCode, String address, String email, Date fnac,
			int tlf) {
		super();
		this.name = name;
		this.surnames = surnames;
		this.city = city;
		this.postalCode = postalCode;
		this.address = address;
		this.email = email;
		this.fnac = fnac;
		this.tlf = tlf;
		this.age = age;
	}

	public int calculateAge() {
		int age = 0;
		age = fnac.restarFechas();
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}

	public String getcity() {
		return city;
	}

	public void setcity(String city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getFnac() {
		return fnac;
	}

	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}

	public int getTlf() {
		return tlf;
	}

	public void setTlf(int tlf) {
		this.tlf = tlf;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
