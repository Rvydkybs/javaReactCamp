
public class StudentManager extends Student {
	public void sendStudent(Student student1,Student student2,Student student3) {
			student1.setId(1);
			student1.setName("sinejan");
			student1.setLastName("bulut");
			student1.setPassword("123");
			student1.setStudentNumber("b372918");
			
			student2.setId(2);
			student2.setName("r�veyda");
			student2.setLastName("kayaba��");
			student2.setPassword("3452");
			student2.setStudentNumber("c002388");
			
			student3.setId(3);
			student3.setName("dinemis");
			student3.setLastName("kayaba��");
			student3.setPassword("93029");
			student3.setStudentNumber("d120832");
		
	}
	
	public void showStudent(Student[] studentArray) {//��renci bilgilerini okuma
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(i+1 +".��renci bilgileri:\n id: "+studentArray[i].getId()+"\n"
					+ " ismi: "+studentArray[i].getName()+"\n soy ismi: "+studentArray[i].getLastName()+
					"\n �ifre: "+studentArray[i].getPassword()+"\n ��renci numaras�: "+
					studentArray[i].getStudentNumber()+"\n"
		);
		}
	}
}
