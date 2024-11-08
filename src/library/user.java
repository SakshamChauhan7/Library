package library;
import static library.myUtil.*;

public class user{
	
	//these are some basic attribute to user that will be 
	//Utilized by other classes
	
	protected String name = null;
	protected int userId;
	protected int contactNum;
	
	public user(String name,int userId, int contactNum){
		this.name = name;
		this.userId = userId;
		this.contactNum = contactNum;
		
	}
	
	
	
	//All the get methods
	
	public String getName() {
		return this.name;
	}
	
	public int getUserId() {
		return this.userId;
	}
	
	public int getContactNum() {
		return this.contactNum;
	}
	
	//All the set methods
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public void setContactNum(int contactNum) {
		this.contactNum = contactNum;
	}
	
	//Display method
	public void displayUser() {
		
		//using print from myUtil
		print("----------------------------");
		print("      User Information");
		print("Name        : " + this.name);
		print("User Id     : " + this.userId);
		print("Contact No. : " + this.contactNum);
		print("----------------------------");
		
	}
}