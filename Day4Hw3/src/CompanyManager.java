import java.util.Scanner;

public class CompanyManager extends Company {
	public void update(Customer[] customers,CustomerManager customerManager) {
		System.out.println("what do you want to update?(you can only change the person that have the id is 1 !):\n1-name\n"
				+ "2-lastname\n3-date of birth\n4-id no\n");
		Scanner scanner= new Scanner(System.in);
		String result=scanner.nextLine();//kullan�c�n�n girece�i se�enekler
		
		switch (result) {
		case "1": 
			Scanner scanner1= new Scanner(System.in);
			String result1=scanner1.nextLine();
			customers[0].setFirstName(result1);
			customerManager.newSumbit(customers);
			break;
		case "2":
			Scanner scanner2= new Scanner(System.in);
			String result2=scanner2.nextLine();
			customers[0].setLastName(result2);
			customerManager.newSumbit(customers);
			break;
		case "3":
			Scanner scanner3= new Scanner(System.in);
			String result3=scanner3.nextLine();
			customers[0].setDateOfBirth(result3);
			customerManager.newSumbit(customers);
			break;
		case "4":
			Scanner scanner4= new Scanner(System.in);
			String result4=scanner4.nextLine();
			customers[0].setId(result4);
			customerManager.newSumbit(customers);
		default:
			break;
		}
	}
	
	public void delete(Customer[] customers,CustomerManager customerManager) {
		System.out.println("please enter the id of you want to delete:");
		Scanner scanner=new Scanner(System.in);
		String id=scanner.nextLine();
		switch (id) {
		case "1":
			customers[0].setId("deleted");
			customers[0].setFirstName("deleted");
			customers[0].setLastName("deleted");
			customers[0].setDateOfBirth("deleted");
			customerManager.newSumbit(customers);
			
			break;
		case "2":
			customers[1].setId("deleted");
			customers[1].setFirstName("deleted");
			customers[1].setLastName("deleted");
			customers[1].setDateOfBirth("deleted");
			customerManager.newSumbit(customers);
			break;
		case "3":
			customers[2].setId("deleted");
			customers[2].setFirstName("deleted");
			customers[2].setLastName("deleted");
			customers[2].setDateOfBirth("deleted");
			customerManager.newSumbit(customers);
		default:
			break;
		}
	}
	
	public void control(Customer[] customers) {//kullan�c� kontrol
		for (Customer customer : customers) {
		
			if (customer.getId().length()>7&&customer.getFirstName()!= null
					&&customer.getLastName()!=null ) {
				System.out.println("wrong id number! try again...");
			}
			else {
				System.out.println("All members are real person!\n");
				break;
			}
		}
	}
	
	public void sold(Customer customers,int howManySold) {
		System.out.println(customers.getFirstName()+" i�in "+howManySold+" adet sat�� yap�ld�. kapmanya sonras� kazan�:"+
				( howManySold*2)+"\n");

	}
}
