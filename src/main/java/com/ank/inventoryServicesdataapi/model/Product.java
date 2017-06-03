package com.ank.inventoryServicesdataapi.model;

import static javax.persistence.GenerationType.SEQUENCE;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Product", catalog = "inventoryService")
public class Product {

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	@Column(name = "prodId", unique = true, nullable = false)
	private int prodId;
	private String prodName;
	private String prodType;
	private String prodDesc;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company", nullable = false)
	private Company company;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prod")
	private Set<SubProduct> subProduct = new HashSet<SubProduct>();

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdType() {
		return prodType;
	}

	public void setProdType(String prodType) {
		this.prodType = prodType;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		company = company;
	}

	public Set<SubProduct> getSubProduct() {
		return subProduct;
	}

	public void setSubProduct(Set<SubProduct> subProduct) {
		this.subProduct = subProduct;
	}

}
