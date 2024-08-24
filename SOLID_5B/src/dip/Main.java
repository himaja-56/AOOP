package dip;

public class Main {

	public static void main(String[] args) {
		MessageService emailService = new EmailService();
		MyApplication app1 = new MyApplication(emailService);
		app1.processMessage("Message sent via Email");
		
		MessageService smsService = new SMSService();
		MyApplication app2 = new MyApplication(smsService);
		app2.processMessage("Message sent via SMS");
		// TODO Auto-generated method stub

	}

}
