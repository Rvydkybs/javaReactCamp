package koldamaio.northwind.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import koldamaio.northwind.business.abstracts.ProductService;
import koldamaio.northwind.entities.concretes.Product;

@RestController//controller olduğunu belirttik
@RequestMapping("/api/products")//bu istek gelirse bu sayfa çalışsın
public class ProductsController {//farklı programlamalara entegre edilebilen api kısmı
	
	 private ProductService productService;
	 	@Autowired//bütün projeyi tarar,productservic'in bağlı olduğu sınıfı bulur,onu new eder,newlenmiş objeyi gelir
	 	//bize parametre olarak aşağıdaki fonk.a verir!!!!!! İNJECTİON MANTIĞI BUDUR!!!!!!!
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")//kodlama.io/api/products/getall isteği yapılırsa bu fonk. çalışacak
	public List<Product> getAll(){
		return this.productService.getAll();
	}
}
