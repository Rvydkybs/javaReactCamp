package inheritance2;

public class CustomerManage {
 public void add(Logger logger) {
	 System.out.println("m��teri eklendi:");
	//buray� yazmak yerine base s�nn�ftan parametre g�ndeririz;
	 //DatabaseLogger logger=new DatabaseLogger();
	 logger.log();//ana s�n�ftaki fonksiyonu �a��rd�
 }
}
