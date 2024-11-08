package library;
import static library.myUtil.*;
import java.util.Scanner;

public class Main{

	
	//Scanner method
	private static Scanner input = new Scanner(System.in);
	
	//main
	public static void main(String[] args) {
		
		String name;
		ask("Enter Name: ");
		name = input.nextLine();
		
		int userId;
		ask("Enter User Id: ");
		userId = input.nextInt();
		input.nextLine();
		
		int contactNum;
		ask("Enter Contact No: ");
		contactNum = input.nextInt();
		input.nextLine();
		
		int booksCount;
		ask("Enter Number of book Borrowed : ");
		booksCount = input.nextInt();
		input.nextLine();
		
		
		Member user = new Member(name,userId,contactNum,booksCount);
		
		user.displayMemberInfo();
	}
}

