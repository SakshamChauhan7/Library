package library;

import static library.myUtil.print;

public class Member extends User{
	
	private int borrowedBookCount;
	
	public Member(String name,int userId, int contactNum, int borrowedBookCount) {
		super(name,userId,contactNum);
		this.borrowedBookCount = borrowedBookCount;
	}
	
	
	//All get method
	
	public int getBorrowedBookCount() {
		return this.borrowedBookCount;
	}
	
	//All set method
	
	public void setBorrowedBookCount(int borrowedBookCount) {
		this.borrowedBookCount = borrowedBookCount;
	}
	
	//Display function
	
	public void displayMemberInfo() {
		super.displayUser();
		print("Books Borrowed : " + this.borrowedBookCount);
		print("----------------------------");
	}
}

