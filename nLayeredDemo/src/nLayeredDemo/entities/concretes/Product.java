package nLayeredDemo.entities.concretes;

import nLayeredDemo.entities.abstracts.Entity;//ba?ka bir paketten kulland???m?z i?in import ettik

public class Product implements Entity {
	private int id;
	private  String name;
	private int categoryId;
	private double unitPrice;
	private int unitInStock;
	
	public Product() {
		
	}
	public Product(int id, String name, int categoryId, double unitPrice, int unitInStock) {
		super();
		this.id = id;
		this.name = name;
		this.categoryId = categoryId;
		this.unitPrice = unitPrice;
		this.unitInStock = unitInStock;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
}
