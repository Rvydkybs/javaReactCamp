package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;
import nLayeredDemo.jLogger.JLoggerManager;

public class ProductManager implements ProductService {
//DEPENDENCY ?NJECT?ON
	private ProductDao productDao;//gev?ek ba??ml?l?k i?in
	private LoggerService loggerService;
	
	public ProductManager(ProductDao productDao,LoggerService loggerService) {//gev?ek ba??ml?l?k i?in
		super();
		this.productDao = productDao;
		this.loggerService=loggerService;
	}
//DEPENDENCY ?NJECT?ON
	@Override
	public void add(Product product) {
		// i? kodlar?
		if (product.getCategoryId()==1) {
			System.out.println("bu kategoride ?r?n kabul edilmiyor.");
			return;//bunu okuyunca fonk i?inden ??kar
		}
		// HibernateProductDao dao=new HibernateProductDao(); 
		//kat? ba??ml?l?k yapt??? i?in uygulanmaz!
		this.productDao.add(product);//art?k hangi productu istersek onu g?ndeririz
		this.loggerService.logToSystem("?r?n eklendi:"+product.getName());
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
