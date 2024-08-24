package librarymanagementsystem;

public class Main {

	public static void main(String[] args) {
		Library library = new Library();
		Book book1 = new Book("2000","Winnie-the-Pooh");
		Member member1 = new Member("Bob","M1");
		
		library.addBook(book1);
		library.addMember(member1);
		
		BorrowingProcess borrowingProcess = new BorrowingProcess(library);
		borrowingProcess.borrow(member1, book1);
		borrowingProcess.returnBook(member1, book1);
		// TODO Auto-generated method stub

	}

}
