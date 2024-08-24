package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;


public class Library {
	private List<Book> books = new ArrayList<>();
	private List<Member> members = new ArrayList<>();
	
	public void addBook(Book book) {
		books.add(book);
	}
	
	public List<Book> getBooks(){
		return books;
	}
	
	public void addMember(Member member) {
		members.add(member);
	}
	
	public List<Member> getMembers(){
		return members;
	}

}
