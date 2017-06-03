package com.ank.inventoryServicesdataapi.model;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Company", catalog = "inventoryService")
public class Company {

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	@Column(name = "compId", unique = true, nullable = false)
	private int compCode;
	private String compName;
	private String compAddress;
	private String compPhone;
	private String compMobile;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	private Set<Product> productSet = new HashSet<Product>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "company")
	private Set<SubProduct> subProductSet = new HashSet<SubProduct>();

	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Company(int compCode, String compName, String compAddress,
			String compPhone, String compMobile, Set<Product> productSet,
			Set<SubProduct> subProductSet) {
		super();
		this.compCode = compCode;
		this.compName = compName;
		this.compAddress = compAddress;
		this.compPhone = compPhone;
		this.compMobile = compMobile;
		this.productSet = productSet;
		this.subProductSet = subProductSet;
	}

	public int getCompCode() {
		return compCode;
	}

	public void setCompCode(int compCode) {
		this.compCode = compCode;
	}

	public String getCompName() {
		return compName;
	}

	public void setCompName(String compName) {
		this.compName = compName;
	}

	public String getCompAddress() {
		return compAddress;
	}

	public void setCompAddress(String compAddress) {
		this.compAddress = compAddress;
	}

	public String getCompPhone() {
		return compPhone;
	}

	public void setCompPhone(String compPhone) {
		this.compPhone = compPhone;
	}

	public String getCompMobile() {
		return compMobile;
	}

	public void setCompMobile(String compMobile) {
		this.compMobile = compMobile;
	}

	public Set<Product> getProductSet() {
		return productSet;
	}

	public void setProductSet(Set<Product> productSet) {
		this.productSet = productSet;
	}

	public Set<SubProduct> getSubProductSet() {
		return subProductSet;
	}

	public void setSubProductSet(Set<SubProduct> subProductSet) {
		this.subProductSet = subProductSet;
	}

}
