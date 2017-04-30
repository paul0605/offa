package com.offa.offer.db;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Offer")
public class Offer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name="offerkey" , strategy="increment")
	@GeneratedValue(generator="offerkey")
	@Column(name="offerkey", nullable = false)
	Long offerkey;
	@Column(name = "offerid", nullable = true)
	String offerid;
	@Column(name = "tennant", nullable = true)
	String tennant;
	@Column(name = "userid", nullable = true)
	String userid;
	@Column(name = "jobname", nullable = true)
	String jobname;
	@Column(name = "company", nullable = true)
	String company;
	@Column(name = "title", nullable = true)
	String title;
	@Column(name = "addressid", nullable = true)
	Long addressid;
	@Column(name = "dateoffer", nullable = true)
	Timestamp dateoffer;
	@Column(name = "daterespond", nullable = true)
	Timestamp daterespond;
	@Column(name = "Remunerationid", nullable = true)
	String Remunerationid;
	
	
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="addressid")
	Address address;
	
	public Long getOfferkey() {
		return offerkey;
	}
	public void setOfferkey(Long offerkey) {
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
	public Long getAddressid() {
		return addressid;
	}
	public void setAddressid(Long addressid) {
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
}
