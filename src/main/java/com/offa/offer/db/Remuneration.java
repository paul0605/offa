package com.offa.offer.db;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Offer")
public class Remuneration implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GenericGenerator(name="remunerationid" , strategy="increment")
	@GeneratedValue(generator="remunerationid")
	@Column(name="remunerationid", nullable = false)
	Long remunerationid;
	@Column(name = "basesalary", nullable = true)
	String basesalary;
	@Column(name = "annualincrease", nullable = true)
	String annualincrease;
	@Column(name = "signonbonus", nullable = true)
	String signonbonus;
	@Column(name = "signonbonusannualfreq", nullable = true)
	String signonbonusannualfreq;
	@Column(name = "commissionbonus", nullable = true)
	String commissionbonus;
	@Column(name = "commissionbonusannualfreq", nullable = true)
	String commissionbonusannualfreq;
	@Column(name = "addressid", nullable = true)
	String addressid;
	@Column(name = "dateoffer", nullable = true)
	Timestamp dateoffer;
	@Column(name = "daterespond", nullable = true)
	Timestamp daterespond;
	@Column(name = "Remunerationid", nullable = true)
	String Remunerationid;
	
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
