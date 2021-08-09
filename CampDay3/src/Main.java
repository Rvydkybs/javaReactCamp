
public class Main {

	public static void main(String[] args) {
		System.out.println("ÖÐRENCÝ BÝLGÝLERÝ:\n");
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		Student[] studentArray= {student1,student2,student3};
		StudentManager studentManager=new StudentManager();
		UserManager userManager=new UserManager();
		studentManager.sendStudent(student1,student2,student3);//öðrenci bilgilerini atama fonksiyonlarý
		studentManager.showStudent(studentArray);
		System.out.println("KURS SEÇENEKLERÝ:\n");
		userManager.showMyCurse();
		
		Instructor instructor=new Instructor();
		InstructorManager instructorManager=new InstructorManager();//1 eðitici var
		System.out.println("EÐÝTÝCÝ BÝLGÝLERÝ:\n");
		instructorManager.sendInstructor(instructor);
		instructorManager.showInstructor(instructor);

	}

}
