package lsp;

public class Main {

	public static void main(String[] args) {
		Bird flyingBird = new Bird();
		flyingBird.fly();
		
		Bird lion = new Lion();
		try {
			lion.fly();
		}catch(UnsupportedOperationException e) {
			System.out.println(e.getMessage());
		}
		// TODO Auto-generated method stub

	}

}
