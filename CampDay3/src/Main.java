
public class Main {

	public static void main(String[] args) {
		System.out.println("��RENC� B�LG�LER�:\n");
		Student student1=new Student();
		Student student2=new Student();
		Student student3=new Student();
		Student[] studentArray= {student1,student2,student3};
		StudentManager studentManager=new StudentManager();
		UserManager userManager=new UserManager();
		studentManager.sendStudent(student1,student2,student3);//��renci bilgilerini atama fonksiyonlar�
		studentManager.showStudent(studentArray);
		System.out.println("KURS SE�ENEKLER�:\n");
		userManager.showMyCurse();
		
		Instructor instructor=new Instructor();
		InstructorManager instructorManager=new InstructorManager();//1 e�itici var
		System.out.println("E��T�C� B�LG�LER�:\n");
		instructorManager.sendInstructor(instructor);
		instructorManager.showInstructor(instructor);

	}

}
