package library;


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
	
	
	
	//All the get functions
	
	public String getName() {
		return name;
	}
	
	public int getUserId() {
		return userId;
	}
	
	public int getContactNum() {
		return contactNum;
	}
}