package librarymanagementsystem;

public class Member {
	private String name;
	private String memberId;
	
	public Member(String name,String memberId) {
		this.name = name;
		this.memberId = memberId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMemberid() {
		return memberId;
	}
	
	public void setMemberid(String memberId) {
		this.memberId = memberId;
	}

}
