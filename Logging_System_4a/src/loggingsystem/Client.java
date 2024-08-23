package loggingsystem;

public class Client {

	public static void main(String[] args) {
		LogHandler infoHandler = new InfoHandler();
		LogHandler debugHandler = new DebugHandler();
		LogHandler errorHandler = new ErrorHandler();
		
		infoHandler.setNextHandler(debugHandler);
		debugHandler.setNextHandler(errorHandler);
		
		Logger logger = new Logger();
		
		logger.addCommand(new LogCommand(infoHandler,LogLevel.INFO));
		logger.addCommand(new LogCommand(infoHandler,LogLevel.DEBUG));
		logger.addCommand(new LogCommand(infoHandler,LogLevel.ERROR));
		
		logger.processCommands();
		// TODO Auto-generated method stub

	}

}
