package intro;

public class Product {
	//encapsulation-get set kullanma
	private int id;
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;//indirim
	
	 public Product() {
		
	}
	public Product(int id, String name, double unitPrice, String detail,double discount) {//sa� t�k source-generate cunstructor fields
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount=discount;
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

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getUnitpriceAfterDiscount() {
		return this.unitPrice-(this.unitPrice*this.discount/100);//indirim hesaplad�k
	}
	
	
	/*
	 * //constructor function: public Product() {//yap�c� fonskiyon biz yazmasak da
	 * �al���r! System.out.println("i worked"); } //�K�NC� YAPICI FONKS�YONUMUZ:
	 * public Product(int id,String name,double unitPrice,String detail) {//OVERR�DE
	 * ��LEM�! //Bu yap�c� fonksiyonu bu �ekilde tan�mlad�k ve main blo�unda b�t�n
	 * �zellikleri //tek tek tan�mlamam�za gerek kalmad�,art�k sadece parametre
	 * g�ndererek de�er vermi� olaca��z! this.id=id;//bu classtaki id=parametredeki
	 * id this.name=name; this.unitPrice=unitPrice; this.detail=detail;
	 * 
	 * }
	 */
	
}
