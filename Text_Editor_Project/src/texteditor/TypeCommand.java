package texteditor;

public class TypeCommand implements Command{
	private TextEditor textEditor;
	private String text;
	
	public TypeCommand(TextEditor textEditor, String text) {
		this.textEditor = textEditor;
		this.text = text;
	}

	@Override
	public void execute() {
		textEditor.type(text);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void undo() {
		textEditor.delete(text.length());
		// TODO Auto-generated method stub
		
	}

}
