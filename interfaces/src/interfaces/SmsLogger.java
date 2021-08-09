package interfaces;

public class SmsLogger implements Logger {

	@Override
	public void log(String message) {//interfacede imzasý olan methodun gövdesi
	System.out.println("sms gönderildi:"+message);	
		
		
	}

}
