package model;

import java.io.Serializable;

public class RestaurantProduct implements Serializable{

	private static final long serialVersionUID = 1;
	private String name;
	private String typeOfProduct;
	private String sizeOfProduct;
	private double priceOfProduct;
	private String ingredientsOfProduct;
	private MembersStatus productStatus;
	
	public RestaurantProduct(String name, String typeOfProduct, String ingredientsOfProduct, String sizeOfProduct, double priceOfProduct) {
		this.name = name;
		this.typeOfProduct=typeOfProduct;
		this.ingredientsOfProduct=ingredientsOfProduct;
		this.sizeOfProduct=sizeOfProduct;
		this.priceOfProduct=priceOfProduct;
		this.productStatus=MembersStatus.ACTIVE;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getTypeOfProduct() {
		return typeOfProduct;
	}
	
	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct=typeOfProduct;
	}
	
	public String getSizeOfProduct() {
		return sizeOfProduct;
	}
	
	public void setSizeOfProduct(String sizeOfProduct) {
		this.sizeOfProduct=sizeOfProduct;
	}
	
	
	public double getPriceOfProduct() {
		return priceOfProduct;
	}
	
	public void setPriceOfProduct(double priceOfProduct) {
		this.priceOfProduct=priceOfProduct;
	}
	
	public String getIngredientsOfProduct() {
		return ingredientsOfProduct;
	}
	
	public void setIngredientsOfProduct(String ingredientsOfProduct) {
		this.ingredientsOfProduct=ingredientsOfProduct;
	}
	

	public MembersStatus getProductStatus() {
		return productStatus;
	}
	
	public void setProductStatus(MembersStatus productStatus) {
		this.productStatus=productStatus;
	}
	
	public String toString() {
		return name;
	}
}
