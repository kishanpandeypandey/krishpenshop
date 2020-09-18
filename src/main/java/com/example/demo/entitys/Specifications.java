package com.example.demo.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="product_specification")
public class Specifications {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long specificationsId;
	
	@ManyToOne
	private Product product;
	
	@Column(name="p_modelnumber")
	private String modelNumber;
	
	@Column(name="p_modelname")
	private String modelname;
	
	@Column(name="p_simtype")
	private String simType;
	
	@Column(name="p_touchscreen")
	private String touchScreen;
	
	@Column(name="p_displaysize")
	private Float diplaySize;
	
	@Column(name="p_operatingsystem")
	private String operatingSystem;
	
	@Column(name="p_storage")
	private String storage;
	
	public Specifications() {}

	public Specifications(Product product, String modelNumber, String modelname, String simType, String touchScreen,
			Float diplaySize, String operatingSystem, String storage) {
		super();
		this.product = product;
		this.modelNumber = modelNumber;
		this.modelname = modelname;
		this.simType = simType;
		this.touchScreen = touchScreen;
		this.diplaySize = diplaySize;
		this.operatingSystem = operatingSystem;
		this.storage = storage;
	}

	public Long getSpecificationsId() {
		return specificationsId;
	}

	public void setSpecificationsId(Long specificationsId) {
		this.specificationsId = specificationsId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public String getSimType() {
		return simType;
	}

	public void setSimType(String simType) {
		this.simType = simType;
	}

	public String getTouchScreen() {
		return touchScreen;
	}

	public void setTouchScreen(String touchScreen) {
		this.touchScreen = touchScreen;
	}

	public Float getDiplaySize() {
		return diplaySize;
	}

	public void setDiplaySize(Float diplaySize) {
		this.diplaySize = diplaySize;
	}

	public String getOperatingSystem() {
		return operatingSystem;
	}

	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}
	
	
	

}
