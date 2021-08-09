public class CustomerManager extends Customer {
	public void Sumbit(Customer[] customers) {//oyuncularýn ilk kez kaydedilmesi
	System.out.println("kaydedilen oyuncular:\n");
		for (Customer customer2 : customers) {
			
			System.out.println("id:"+customer2.getId()+
					"\nadý:"+customer2.getFirstName()+"\nsoyadý:"+customer2.getLastName()+"\ndoðum yýlý:"+customer2.getDateOfBirth()+
					"\n");
		}
		
	}
	
	public void newSumbit(Customer[] customers) {//oyuncularda deðiþiklik yapýlýrsa
		System.out.println("\nYeni  oyuncular:\n");
		for (Customer customer2 : customers) {
			
			System.out.println("id:"+customer2.getId()+
					"\nadý:"+customer2.getFirstName()+"\nsoyadý:"+customer2.getLastName()+"\ndoðum yýlý:"+customer2.getDateOfBirth()+
					"\n");
		}
		
	}
	
	
	
}
