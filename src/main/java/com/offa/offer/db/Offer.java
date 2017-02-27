package com.offa.offer.db;

import java.sql.Timestamp;

public class Offer {
	
	String offerkey;
	String offerid;
	String tennant; 
	String userid;
	String jobname; 
	String company; 
	String title; 
	String addressid;
	Timestamp dateoffer;
	Timestamp daterespond;
	String Remunerationid;
	
	public String getOfferkey() {
		return offerkey;
	}
	public void setOfferkey(String offerkey) {
		this.offerkey = offerkey;
	}
	public String getOfferid() {
		return offerid;
	}
	public void setOfferid(String offerid) {
		this.offerid = offerid;
	}
	public String getTennant() {
		return tennant;
	}
	public void setTennant(String tennant) {
		this.tennant = tennant;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getJobname() {
		return jobname;
	}
	public void setJobname(String jobname) {
		this.jobname = jobname;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddressid() {
		return addressid;
	}
	public void setAddressid(String addressid) {
		this.addressid = addressid;
	}
	public Timestamp getDateoffer() {
		return dateoffer;
	}
	public void setDateoffer(Timestamp dateoffer) {
		this.dateoffer = dateoffer;
	}
	public Timestamp getDaterespond() {
		return daterespond;
	}
	public void setDaterespond(Timestamp daterespond) {
		this.daterespond = daterespond;
	}
	public String getRemunerationid() {
		return Remunerationid;
	}
	public void setRemunerationid(String remunerationid) {
		Remunerationid = remunerationid;
	}
}
