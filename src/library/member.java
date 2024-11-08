package library;

public class member extends user{
	
	private int borrowedBookCount;
	
	public member(String name,int userId, int contactNum, int borrowedBookCount) {
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
	
	
}

