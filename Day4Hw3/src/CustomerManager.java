public class CustomerManager extends Customer {
	public void Sumbit(Customer[] customers) {//oyuncular�n ilk kez kaydedilmesi
	System.out.println("kaydedilen oyuncular:\n");
		for (Customer customer2 : customers) {
			
			System.out.println("id:"+customer2.getId()+
					"\nad�:"+customer2.getFirstName()+"\nsoyad�:"+customer2.getLastName()+"\ndo�um y�l�:"+customer2.getDateOfBirth()+
					"\n");
		}
		
	}
	
	public void newSumbit(Customer[] customers) {//oyuncularda de�i�iklik yap�l�rsa
		System.out.println("\nYeni  oyuncular:\n");
		for (Customer customer2 : customers) {
			
			System.out.println("id:"+customer2.getId()+
					"\nad�:"+customer2.getFirstName()+"\nsoyad�:"+customer2.getLastName()+"\ndo�um y�l�:"+customer2.getDateOfBirth()+
					"\n");
		}
		
	}
	
	
	
}
