package intro;
//projeyi kald�ran k�s�m bu class
public class Main {

	public static void main(String[] args) {//program�n �al��maya ba�lad��� k�s�m
		
		Product product1=new Product(1,"lenovo v14",15000,"16 GB RAM",10 );//referans olu�turma,intance
		//product1 nesnesi i�in art�k b�t�n �zellikler kolayl�kla tan�mland�
		//bu bilgiler �u anda bellekte ge�ici olarak tutuluyor
		//bunlar� silinmez bir �ekilde tutmak i�in DB kullan�r�z
		
		Product product2=new Product();
		product2.setId(2);//de�i�kenler private oldu�u i�in burda set ile de�er verdik
		product2.setName("Lenovo V15");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitpriceAfterDiscount());//biz set edemeyiz sadece okuyabiliriz bu k�sm�

		//		Product product3=new Product();		
//		Product[] produtcs= {product1,product2,product3};//nesneleri tutan bir dizi
//		for (Product product : produtcs) {
//			System.out.println(product.name);//o anki product nesnesi hangisiyse onun name i yaz�l�r
//		}
//		System.out.println(produtcs.length);
//		
//		Category category1=new Category();
//		category1.id=1;
//		category1.name="bilgisayar";
//		Category category2=new Category();
//		category2.id=1;
//		category2.name="ev/bah�e";
//		
//		ProductManager productManager=new ProductManager();
//		productManager.addToCart(product1);//asl�nda adres g�nderiyoruz
//		productManager.addToCart(product2);
//		productManager.addToCart(product3);
		
		
		
		
	}

}
