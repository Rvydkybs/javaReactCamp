package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManage customerManage=new CustomerManage();
		customerManage.add(new DatabaseLogger());//bu parametreye istedi�imiz ocuk s�n�ftan referans g�nderebiliriz
		//bu k�sm� if else bloklar�yla
		//yazmak yerine bu e�kilde istedi�imiz parametreyi
		//veririz ve kod daha sa�l�kl� olur
	}

}
