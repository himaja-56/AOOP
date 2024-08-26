package texteditor;

import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
	private List<Command> history = new ArrayList<>();
	private int index = -1;
	
	public void addCommand(Command command) {
		history = history.subList(0, index+1);
		history.add(command);
		index++;
	}
	
	public void undo() {
		if(index>=0) {
			history.get(index).undo();
			index--;
		}
	}
	
	public void redo() {
		if(index<history.size()-1) {
			index++;
			history.get(index).execute();
		}
	}

}
