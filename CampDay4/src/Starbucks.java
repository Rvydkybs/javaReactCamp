
public class Starbucks implements Mernis {
	String firstName;
	String lastName;
	String[] mernisNumber= {"18794090208","7801902397","081232683"};//m��teri tc'leri
	
	@Override
	public void control(Starbucks[] starbucks) {
		starbucks[0].mernisNumber[0]=this.mernisNumber[0];
		starbucks[1].mernisNumber[1]=this.mernisNumber[1];
		starbucks[2].mernisNumber[2]=this.mernisNumber[2];
		
		System.out.println("Mernis kontrol� yap�ld�!\n");
		
	}
	@Override
	public void add(Starbucks[] starbucks) {
		for (Starbucks starbucks2 : starbucks) {
			System.out.println(starbucks2.getFirstName()+" "+starbucks2.getLastName()
					+ "\nm��terisi veri taban�na eklendi\n");
		}
		
		
	}

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String[] getMernisNumber() {//m��teri tc'leri sadece okunabilir
		return mernisNumber;
	}
	
	

}
