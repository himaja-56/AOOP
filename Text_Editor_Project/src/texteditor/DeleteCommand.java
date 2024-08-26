package texteditor;

public class DeleteCommand implements Command{
	private TextEditor textEditor;
	private int length;
	private String deletedText;
	
	public DeleteCommand(TextEditor textEditor, int length) {
		this.textEditor = textEditor;
		this.length = length;
	}

	@Override
	public void execute() {
		deletedText = textEditor.delete(length);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		textEditor.type(deletedText);
		// TODO Auto-generated method stub
		
	}

}
