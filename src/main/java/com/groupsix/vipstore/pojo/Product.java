package com.groupsix.vipstore.pojo;

public class Product {
	
	private int productId;
	
	private String productName;
	
	private String productDescription;
	
	private Float productPrice;
	
	private Integer productStock;
	
	private boolean productIsDelete;
	
	private String productPath;
	
	private String productOrigin;
	
	private String productType;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	public Integer getProductStock() {
		return productStock;
	}

	public void setProductStock(Integer productStock) {
		this.productStock = productStock;
	}

	public boolean isProductIsDelete() {
		return productIsDelete;
	}

	public void setProductIsDelete(boolean productIsDelete) {
		this.productIsDelete = productIsDelete;
	}

	public String getProductPath() {
		return productPath;
	}

	public void setProductPath(String productPath) {
		this.productPath = productPath;
	}

	public String getProductOrigin() {
		return productOrigin;
	}

	public void setProductOrigin(String productOrigin) {
		this.productOrigin = productOrigin;
	}
	
	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public Product(String productName, String productDescription, float productPrice, int productStock,
			boolean productIsDelete, String productPath, String productOrigin,String productType) {
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productStock = productStock;
		this.productIsDelete = productIsDelete;
		this.productPath = productPath;
		this.productOrigin = productOrigin;
		this.productType = productType;
	}
	
	public Product(int productId ,String productName, String productDescription, float productPrice, int productStock,
			String productOrigin) {
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productOrigin = productOrigin;
		this.productStock = productStock;
		this.productPath = null;
		this.productIsDelete = true;
		this.productType = null;
	}
	
	public Product() {
		
	}

}
