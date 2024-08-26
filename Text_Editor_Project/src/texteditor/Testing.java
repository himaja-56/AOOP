package texteditor;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Testing {
	private TextEditor editor;
	
	@Before
	public void setUp() {
		editor = new TextEditor();
	}
	
	@Test
	public void testtyping() {
		Command command = new TypeCommand(editor,"Hello");
		editor.executeCommand(command);
		assertEquals("Hello",editor.getText());
	}
	
	@Test
	public void testDeleting() {
		editor.type("Hello");
		Command command = new DeleteCommand(editor,2);
		editor.executeCommand(command);
		assertEquals("Hel",editor.getText());
	}
	
	@Test
	public void testUndoTyping() {
		Command command = new TypeCommand(editor,"Hello");
		editor.executeCommand(command);
		editor.undo();
		assertEquals("",editor.getText());
	}
	
	@Test
	public void testRedoTyping() {
		Command command = new TypeCommand(editor,"Hello");
		editor.executeCommand(command);
		editor.undo();
		editor.redo();
		assertEquals("Hello",editor.getText());
	}
	
	@Test
	public void testUndoDeleting() {
		editor.type("Hello");
		Command command = new DeleteCommand(editor,2);
		editor.executeCommand(command);
		editor.undo();
		assertEquals("Hello",editor.getText());
	}
	
	@Test
	public void testRedoDeleting() {
		editor.type("Hello");
		Command command = new DeleteCommand(editor,2);
		editor.executeCommand(command);
		editor.undo();
		editor.redo();
		assertEquals("Hel",editor.getText());
	}

}
