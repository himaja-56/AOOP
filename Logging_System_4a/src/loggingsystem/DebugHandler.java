package loggingsystem;

public class DebugHandler extends LogHandler{

	@Override
	protected boolean canHandle(LogLevel level) {
		// TODO Auto-generated method stub
		return level == LogLevel.DEBUG;
	}

	@Override
	protected void writeMessage(String message) {
		System.out.println("DEBUG: "+message);
		// TODO Auto-generated method stub
		
	}

}
