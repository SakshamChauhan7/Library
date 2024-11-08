package library;
import static library.myUtil.*;

public class user{
	
	//these are some basic attribute to user that will be 
	//Utilized by other classes
	
	String name = null;
	int userId;
	int contactNum;
	
	public user(String uName,int uId, int Cnum){
		name = uName;
		userId = uId;
		contactNum = Cnum;
		
	}
	
	
	
	//All the get methods
	
	public String getName() {
		return name;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getContactNum() {
		return contactNum;
	}
	
	//All the set methods
	public void setName(String N) {
		name = N;
	}
	
	public void setUserId(int uId) {
		userId = uId;
	}
	
	public void setContactNum(int cNum) {
		contactNum = cNum;
	}
	
	//Display method
	public void displayUser() {
		
		//using print from myUtil
		print("----------------------------");
		print("      User Information");
		print("Name        : " + name);
		print("User Id     : " + userId);
		print("Contact No. : " + contactNum);
		print("----------------------------");
		
	}
}