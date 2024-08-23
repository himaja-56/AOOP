package loggingsystem;

public class InfoHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.INFO;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("INFO: "+message);
		// TODO Auto-generated method stub
		
	}

}
