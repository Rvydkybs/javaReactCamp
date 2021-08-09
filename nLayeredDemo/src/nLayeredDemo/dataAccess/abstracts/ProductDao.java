package nLayeredDemo.dataAccess.abstracts;

import java.util.List;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDao {
	void add(Product product);
	void update(Product product);
	void delete(Product product);
	Product get(int id);//id numaras�na ait �r�n� getir
	List<Product> getAll();//(arraylist'in basit hali)listelemenin oldu�u yerde array 
	
}
