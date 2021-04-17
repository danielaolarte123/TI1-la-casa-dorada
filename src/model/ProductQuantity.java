package model;

import java.io.Serializable;

public class ProductQuantity implements Serializable{

	private static final long serialVersionUID = 1;
	private RestaurantProduct p;
	private String nameProduct;
	private double quantity;
	private RestaurantProduct pr;
	private double price;
	
	public ProductQuantity(String nameProduct, double quantity, RestaurantProduct pr) {
		
		this.nameProduct=nameProduct;
		this.quantity=quantity;
		price=pr.getPriceOfProduct();
		
	}

	
	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	
	
	public String getNameProduct() {
		return nameProduct;
	}

	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}


	public RestaurantProduct getP() {
		return p;
	}

	public void setP(RestaurantProduct p) {
		this.p = p;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public RestaurantProduct getPr() {
		return pr;
	}

	public void setPr(RestaurantProduct pr) {
		this.pr = pr;
	}
	
	
	
	
}
