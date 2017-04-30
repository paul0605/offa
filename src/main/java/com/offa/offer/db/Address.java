package com.offa.offer.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.annotations.GenericGenerator;

public class Address implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name="addressid" , strategy="increment")
	@GeneratedValue(generator="addressid")
	@Column(name="addressid", nullable = false)
	Long addressid;
	@Column(name = "addressline1", nullable = true)
	String  addressline1;
	@Column(name = "addressline2", nullable = true)
	String addressline2;
	@Column(name = "addressline3", nullable = true)
	String addressline3; 
	@Column(name = "city", nullable = true)
	String city; 
	@Column(name = "state", nullable = true)
	String state; 
	@Column(name = "country", nullable = true)
	String country;
	@Column(name = "zipcode", nullable = true)
	String zipcode;
	
	@OneToOne
	@ForeignKey(name="FK_COUNTRY")
	private Offer offer;
	
	public Long getAddressid() {
		return addressid;
	}
	public void setAddressid(Long addressid) {
		this.addressid = addressid;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getAddressline3() {
		return addressline3;
	}
	public void setAddressline3(String addressline3) {
		this.addressline3 = addressline3;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
}
