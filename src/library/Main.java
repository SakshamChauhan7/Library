package library;
import static library.myUtil.*;
import static library.myUtil.ask;
import static library.myUtil.print;

import java.util.ArrayList;
import java.util.Scanner;


public class Main{

	
	//Array list
	
	private static ArrayList<Member> members = new ArrayList<>();
	
	
	//Scanner method
	private static Scanner input = new Scanner(System.in);
	
	//main
	public static void main(String[] args) {
		
		
		boolean exit = false;
		
		while(!exit) {
			
		//Integer for menu items
		int choice;
		
		//Display Menu items
		print("+++++++++++++++++++++++++++++");
		print("       Library System");
		print("1: Create A New Member");
		print("2. Display All Member");
		print("3: Exit");
		print("+++++++++++++++++++++++++++++");
		print();
		ask("Choose an option: ");
		choice = input.nextInt();
		input.nextLine();
		print();
		
		if (choice == 1) {
			
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
			
			
			int booksCount;
			ask("Enter Number of book Borrowed : ");
			booksCount = input.nextInt();
			
			
			
			Member user = new Member(name,userId,contactNum,booksCount);
			members.add(user);
		}
		
		else if(choice == 2){
			print("----------------------------");
			print("      User Information");
			for (Member member:members) {
				member.displayMemberInfo();
				}
			print("----------------------------");
			}
		
		else if(choice == 3) {
			exit = true;
			}
		
		}
		
	}
}

