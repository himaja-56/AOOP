package librarymanagementsystem;

public interface Borrowable {
	void borrow(Member member,Book book);
	void returnBook(Member member,Book book);
}
