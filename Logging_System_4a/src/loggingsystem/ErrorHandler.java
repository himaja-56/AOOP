package loggingsystem;

public class ErrorHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.ERROR;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("ERROR: "+message);
		// TODO Auto-generated method stub
		
	}

}
