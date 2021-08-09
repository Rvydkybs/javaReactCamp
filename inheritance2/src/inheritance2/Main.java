package inheritance2;

public class Main {

	public static void main(String[] args) {
		CustomerManage customerManage=new CustomerManage();
		customerManage.add(new DatabaseLogger());//bu parametreye istediğimiz ocuk sınıftan referans gönderebiliriz
		//bu kısmı if else bloklarıyla
		//yazmak yerine bu eşkilde istediğimiz parametreyi
		//veririz ve kod daha sağlıklı olur
	}

}
