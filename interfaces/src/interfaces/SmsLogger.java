package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void log(String message) {//interfacede imzas� olan methodun g�vdesi
	System.out.println("sms g�nderildi:"+message);	
		
		
	}

}
