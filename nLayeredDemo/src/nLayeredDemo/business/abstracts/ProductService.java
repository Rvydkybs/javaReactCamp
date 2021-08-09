package nLayeredDemo.business.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductService {
	void add(Product product);//productu servis etmek istiyoruz
	List<Product> getAll();
}
