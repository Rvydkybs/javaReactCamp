public class InstructorManager extends  Instructor {
	public void sendInstructor(Instructor instructor) {
		instructor.setId(01);
		instructor.setName("Engin");
		instructor.setLastName("DEMÝROÐ");
		instructor.setPassword("3434");
		instructor.setInstructorNumber("0101");
	}
	public void showInstructor(Instructor instructor) {
		System.out.println(" Eðitici id: "+instructor.getId()+"\n Eðitici ismi: "+instructor.getName()+"\n Eðitici soyismi: "
				+instructor.getLastName()+"\n Eðitici þifresi: "+instructor.getPassword()
				+"\n Eðitici numarasý: "+instructor.getInstructorNumber()+"\n");
	}
}
