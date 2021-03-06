package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		//spring IoC ile ??z?lecek
		ProductService productService=new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());//ger?ek servislerde
		//interface ile ba?lant? kurulur bu y?zden productservice kulland?k sa? tarafta
		Product product=new Product(1,"elma",3,10,50);
		productService.add(product);
	}

}
