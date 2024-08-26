package texteditor;

public class TextEditor {
	private StringBuilder text = new StringBuilder();
	private CommandHistory history = new CommandHistory();
	
	public void type(String text) {
		this.text.append(text);
	}
	
	public String delete(int length) {
		int start = text.length() - length;
		String deletedText = text.substring(start);
		text.delete(start, text.length());
		return deletedText;
	}
	
	public void executeCommand(Command command) {
		command.execute();
		history.addCommand(command);
	}
	
	public void undo() {
		history.undo();
	}
	
	public void redo() {
		history.redo();
	}
	
	public String getText() {
		return text.toString();
	}

}
