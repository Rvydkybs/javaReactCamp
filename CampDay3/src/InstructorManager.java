public class InstructorManager extends  Instructor {
	public void sendInstructor(Instructor instructor) {
		instructor.setId(01);
		instructor.setName("Engin");
		instructor.setLastName("DEM�RO�");
		instructor.setPassword("3434");
		instructor.setInstructorNumber("0101");
	}
	public void showInstructor(Instructor instructor) {
		System.out.println(" E�itici id: "+instructor.getId()+"\n E�itici ismi: "+instructor.getName()+"\n E�itici soyismi: "
				+instructor.getLastName()+"\n E�itici �ifresi: "+instructor.getPassword()
				+"\n E�itici numaras�: "+instructor.getInstructorNumber()+"\n");
	}
}
