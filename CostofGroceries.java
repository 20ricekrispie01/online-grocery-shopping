import java.util.Scanner;

public class CostofGroceries {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in); //creates scanner to read user input
		
		int numApples;
		int numOranges;
		int numBananas;
		int numPears;
      		int userAge;
      		double totalCost;
      		double discount;
     		// char keepShopping; 
      		boolean isMember;
		String userName;
      		String userMember;
      
      		// keepShopping = 'y';
		
		//asks for user's name and greets them before asking for product amount
		System.out.println("Please enter your name: ");
		userName. scnr.next();
		
		System.out.println("Welcome " + userName + ".");
		System.out.println("How many apples do you want?");
		numApples = scnr.nextInt();
		
      //planned loop to ask if user wants to add more before proceeding to next line
      /* System.out.println("Would you like to add anymore? (y/n)");
      
      while (keepShopping != 'n') {
         numApples = scnr.nextInt();
      } */
		
		System.out.println("How many oranges do you want?");
		numOranges = scnr.nextInt();

		System.out.println("How many bananas do you want?");
		numBananas = scnr.nextInt();
		
		System.out.println("How many pears do you want?");
		numPears = scnr.nextInt();
		
		//asks user for their age and membership
      		System.out.println("What is your age?");
      		userAge = scnr.nextInt();
      
		System.out.println("Do you have a store membership card? (y/n)");
		userMember = scnr.next
			
      //switch case to check whether the user is a member or not
      switch (userMember) {
         case "y" :
         isMember = true;
         break;
      
         default :
         isMember = false;
         break;
      }
      //calculates the total amount of the cost before applying the appropiate discounts
      totalCost = ((numApples * 2.50) + (numOranges * 1.25) 
		+ (numBananas * 0.49) + (numPears * 2.25));
      double seniorDiscount = 0.10;
      double memberDiscount = 0.15;
		
      //program checks the user's age and membership status to give the appropiate values for totalCost
      if ((userAge >= 65) && (isMember == true)) {
         discount = totalCost * (seniorDiscount + memberDiscount);
         totalCost -= discount;
      }
      else if (isMember = true) {
         discount = totalCost * memberDiscount;
         totalCost -= discount;
      }
      
      else if (userAge >= 65) {
         discount = totalCost * seniorDiscount;
         totalCost -= discount;
      }
      
      else {
         totalCost = totalCost;
      }
      
		//output restricts total amount to 2 decimal points, because it makes cents ;)
		System.out.println("You have " + numApples + " apples, " + numOranges 
		+ " oranges, " + numBananas + " bananas, and " + numPears + " pears.");
		System.out.printf("The total amount is %.2f.\n", totalCost);
		System.out.println("Thank you, have a nice day.");
		}
}
