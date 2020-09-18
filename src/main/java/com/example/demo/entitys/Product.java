package com.example.demo.entitys;

import java.sql.Date;
import java.util.Map;
import java.util.List;
import java.util.Locale.Category;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="product_discount")
	private int productDiscount;
	
	@Column(name="product_colour")
	private String productColour;
	
	@Column(name="product_price")
	private Float productPrice;
	
	@Column(name="product_discription")
	private String productDiscription;
	
	@Column(name="product_stock")
	private Long productStock;
	
	@Column(name="product_addeddate")
	private Date productAddedDate;
	
	@Column(name="picByte",length=1000)
	private Byte[] picByte;
	
	@Column(name="seller")
	private String seller;
	
	
	@ManyToOne
	private ProductCategory productCategory;
	
	@Column(name="product_brand")
	private String productBrand;
	
	@Column(name="product_warranty")
	private Long productWarranty;
	
	
	@OneToMany(mappedBy = "product")
	private List<Specifications> specification;
	
	@Column(name="product_varient")
	private String varient;
	
	public Product() {}

	public Product(String productName, int productDiscount, String productColour, Float productPrice,
			String productDiscription, Long productStock, Date productAddedDate, Byte[] picByte, String seller,
			ProductCategory productCategory, String productBrand, Long productWarranty,
			List<Specifications> specification, String varient) {
		super();
		this.productName = productName;
		this.productDiscount = productDiscount;
		this.productColour = productColour;
		this.productPrice = productPrice;
		this.productDiscription = productDiscription;
		this.productStock = productStock;
		this.productAddedDate = productAddedDate;
		this.picByte = picByte;
		this.seller = seller;
		this.productCategory = productCategory;
		this.productBrand = productBrand;
		this.productWarranty = productWarranty;
		this.specification = specification;
		this.varient = varient;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public void setProductDiscount(int productDiscount) {
		this.productDiscount = productDiscount;
	}

	public String getProductColour() {
		return productColour;
	}

	public void setProductColour(String productColour) {
		this.productColour = productColour;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductDiscription() {
		return productDiscription;
	}

	public void setProductDiscription(String productDiscription) {
		this.productDiscription = productDiscription;
	}

	public Long getProductStock() {
		return productStock;
	}

	public void setProductStock(Long productStock) {
		this.productStock = productStock;
	}

	public Date getProductAddedDate() {
		return productAddedDate;
	}

	public void setProductAddedDate(Date productAddedDate) {
		this.productAddedDate = productAddedDate;
	}

	public Byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(Byte[] picByte) {
		this.picByte = picByte;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public Long getProductWarranty() {
		return productWarranty;
	}

	public void setProductWarranty(Long productWarranty) {
		this.productWarranty = productWarranty;
	}

	public List<Specifications> getSpecification() {
		return specification;
	}

	public void setSpecification(List<Specifications> specification) {
		this.specification = specification;
	}

	public String getVarient() {
		return varient;
	}

	public void setVarient(String varient) {
		this.varient = varient;
	}
	
	

	
	
	
	

}
