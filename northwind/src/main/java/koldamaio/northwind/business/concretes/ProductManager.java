package koldamaio.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;//bean=class
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import koldamaio.northwind.business.abstracts.ProductService;
import koldamaio.northwind.dataAccess.abstracts.ProductDao;
import koldamaio.northwind.entities.concretes.Product;

@Service//ANATASYON-bu class servis görevi görecek
public class ProductManager implements ProductService {
//BUSİNESS KATMANINDAN DATA ACCESSE'E ERİEŞECEĞİZ-MANTIK OLARAK BÖYLE ERİŞMEK GEREKİR FARKLI OLABİLİR!
	//DEPENDENCY İNJECTİON;
	private ProductDao productDao;//şu an procutdao'nun bağlı olduğu bir sınıf yok yani injeciton işlemi eksik;
	//bunu spring ile tamamlarız:
	@Autowired//çok yaygın fakat bağımlılık oluşturur
	//cunstructor yazmak zorunda değiliz birden çok injecitn yaparken karışıklık olmaması için yazarız
	
	public ProductManager(ProductDao productDao) {
	super();
	this.productDao = productDao;
}
	@Override
	public List<Product> getAll() {
		
		return this.productDao.findAll(); //JpaRepository nin fonksiyonlarından biri
	}

}
