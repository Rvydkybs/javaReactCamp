package intro;
//projeyi kaldýran kýsým bu class
public class Main {

	public static void main(String[] args) {//programýn çalýþmaya baþladýðý kýsým
		
		Product product1=new Product(1,"lenovo v14",15000,"16 GB RAM",10 );//referans oluþturma,intance
		//product1 nesnesi için artýk bütün özellikler kolaylýkla tanýmlandý
		//bu bilgiler þu anda bellekte geçici olarak tutuluyor
		//bunlarý silinmez bir þekilde tutmak için DB kullanýrýz
		
		Product product2=new Product();
		product2.setId(2);//deðiþkenler private olduðu için burda set ile deðer verdik
		product2.setName("Lenovo V15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitpriceAfterDiscount());//biz set edemeyiz sadece okuyabiliriz bu kýsmý

		//		Product product3=new Product();		
//		Product[] produtcs= {product1,product2,product3};//nesneleri tutan bir dizi
//		for (Product product : produtcs) {
//			System.out.println(product.name);//o anki product nesnesi hangisiyse onun name i yazýlýr
//		}
//		System.out.println(produtcs.length);
//		
//		Category category1=new Category();
//		category1.id=1;
//		category1.name="bilgisayar";
//		Category category2=new Category();
//		category2.id=1;
//		category2.name="ev/bahçe";
//		
//		ProductManager productManager=new ProductManager();
//		productManager.addToCart(product1);//aslýnda adres gönderiyoruz
//		productManager.addToCart(product2);
//		productManager.addToCart(product3);
		
		
		
		
	}

}
