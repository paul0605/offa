Offer -
		tennant
		user id
		Job name
		company
		title
		address - Address line 1
				  Address line 2
				  Address line 3
				  City
				  State
				  Country
				  Zip Code

		Date of offer
		Date to respond
		Remuneration
				- Base salary
				- Annual increase
				- sign on bonus
				- sign on bonus frequency
				- commission
				- commission frequency
				- other pay 
						- name
						- amount
						- frequency
		401k



CREATE TABLE Offer 
	( offerid VARCHAR(50),
	  tennant VARCHAR(20), 
	  userid VARCHAR(20),
      jobname VARCHAR(20), 
      company VARCHAR(50), 
      title VARCHAR(50), 
      addressid VARCHAR(50),
      dateoffer DATE,
      daterespond DATE,
      Remunerationid VARCHAR(50));


CREATE TABLE address 
	( addressid VARCHAR(50), 
	  addressline1 VARCHAR(50),
      addressline2 VARCHAR(50),
      addressline3 VARCHAR(50), 
      city VARCHAR(50), 
      state VARCHAR(50), 
      country VARCHAR(50), 
      zipcode VARCHAR(50));

CREATE TABLE remuneration 
	( remunerationid VARCHAR(50), 
	  basesalary VARCHAR(50),
      annualincrease VARCHAR(10),
      signonbonus VARCHAR(50), 
      signonbonusannualfreq VARCHAR(10),
      commissionbonus VARCHAR(50), 
      commissionbonusannualfreq VARCHAR(10));

 CREATE TABLE otherpay 
	( otherpayid VARCHAR(50),
	  remunerationid VARCHAR(50), 
	  name VARCHAR(50),
      amount VARCHAR(50),
      frequency VARCHAR(10));






  Offer 
	( offerid ,
	  tennant , 
	  userid ,
      jobname , 
      company , 
      title , 
      addressid ,
      dateoffer DATE,
      daterespond DATE,
      Remunerationid VARCHAR(50));


CREATE TABLE address 
	( addressid VARCHAR(50), 
	  addressline1 VARCHAR(50),
      addressline2 VARCHAR(50),
      addressline3 VARCHAR(50), 
      city VARCHAR(50), 
      state VARCHAR(50), 
      country VARCHAR(50), 
      zipcode VARCHAR(50));

CREATE TABLE remuneration 
	( remunerationid VARCHAR(50), 
	  basesalary VARCHAR(50),
      annualincrease VARCHAR(10),
      signonbonus VARCHAR(50), 
      signonbonusannualfreq VARCHAR(10),
      commissionbonus VARCHAR(50), 
      commissionbonusannualfreq VARCHAR(10));

 CREATE TABLE otherpay 
	( otherpayid VARCHAR(50),
	  remunerationid VARCHAR(50), 
	  name VARCHAR(50),
      amount VARCHAR(50),
      frequency VARCHAR(10));
