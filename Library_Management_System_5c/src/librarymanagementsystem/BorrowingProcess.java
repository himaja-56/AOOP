package librarymanagementsystem;

import java.util.HashMap;
import java.util.Map;

public class BorrowingProcess implements Borrowable{
	private Library library;
	private Map<Book,Member> borrowedBooks = new HashMap<>();
	
	public BorrowingProcess(Library library) {
		this.library = library;
	}

	@Override
	public void borrow(Member member, Book book) {
		if(library.getBooks().contains(book)) {
			borrowedBooks.put(book, member);
			library.getBooks().remove(book);
			System.out.println(member.getName()+" borrowed "+book.getTitle()+" titled "+book.getAuthor());
		}
		else {
			System.out.println(book.getTitle()+" is not available");
		}
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returnBook(Member member, Book book) {
		if(borrowedBooks.containsKey(book) && borrowedBooks.get(book).equals(member)) {
			library.getBooks().add(book);
			borrowedBooks.remove(book);
			System.out.println(book.getTitle()+" "+book.getAuthor()+" was not borrowed by "+member.getName());
		}
		// TODO Auto-generated method stub
		
	}

}
