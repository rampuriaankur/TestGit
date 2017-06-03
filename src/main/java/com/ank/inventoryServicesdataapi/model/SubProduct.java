package com.ank.inventoryServicesdataapi.model;

import static javax.persistence.GenerationType.SEQUENCE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "SubProduct", catalog = "inventoryService")
public class SubProduct {

	@Id
	@GeneratedValue(strategy = SEQUENCE)
	@Column(name = "subProdId", unique = true, nullable = false)
	private int subProdId;
	private String subProdDesc;

	@ManyToOne()
	@JoinColumn(name = "prod", nullable = false)
	private Product prod;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company", nullable = false)
	private Company company;
	

	public SubProduct(int subProdId, String subProdDesc, Product prod,
			Company comp) {
		super();
		this.subProdId = subProdId;
		this.subProdDesc = subProdDesc;
		this.prod = prod;
		this.company = comp;
	}

	public SubProduct() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getSubProdId() {
		return subProdId;
	}

	public void setSubProdId(int subProdId) {
		this.subProdId = subProdId;
	}

	public String getSubProdDesc() {
		return subProdDesc;
	}

	public void setSubProdDesc(String subProdDesc) {
		this.subProdDesc = subProdDesc;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public Company getComp() {
		return company;
	}

	public void setComp(Company comp) {
		this.company = comp;
	}

	
	
	
}
