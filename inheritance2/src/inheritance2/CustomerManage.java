package inheritance2;

public class CustomerManage {
 public void add(Logger logger) {
	 System.out.println("müþteri eklendi:");
	//burayý yazmak yerine base sýnnýftan parametre göndeririz;
	 //DatabaseLogger logger=new DatabaseLogger();
	 logger.log();//ana sýnýftaki fonksiyonu çaðýrdý
 }
}
