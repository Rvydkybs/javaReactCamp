
public class Main {
	 public static void main(String[] args) {
		Starbucks starbucks1=new Starbucks();
		Starbucks starbucks2=new Starbucks();
		Starbucks starbucks3=new Starbucks();
		Starbucks[] starbuckses= {starbucks1,starbucks2,starbucks3};
		
		StrabucksManager strabucksManager=new StrabucksManager();
		strabucksManager.setStarbucks(starbuckses);//müşteriler set edildi
		starbucks1.control(starbuckses);
		starbucks1.add(starbuckses);
		
	}
}
