package koldamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import koldamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{//interface interfaceyi extend eder
//jpa=verdiğin veri tipi için-entity-primary key türü alır;
	//product türü için bir sorgulama yapıcam.bu sorgulama için pk kullanıyorum.pknın türü de int.
}
