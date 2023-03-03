import java.util.Scanner;

public class CostofGroceries {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		int numApples;
		int numOranges;
		int numBananas;
		int numPears;
      int userAge;
      double totalCost;
      double discount;
      char keepShopping;
      boolean isMember;
      String userMember;
      
      keepShopping = 'y';
		
		System.out.println("How many apples do you want?");
		numApples = scnr.nextInt();
      
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
      
      System.out.println("What is your age?");
      userAge = scnr.nextInt();
      
      System.out.println("Do you a store membership? Enter yes or no");
      userMember = scnr.next();
      
      switch (userMember) {
         case "yes" :
         isMember = true;
         break;
      
         default :
         isMember = false;
         break;
      }
      
      totalCost = ((numApples * 2.50) + (numOranges * 1.25) 
		+ (numBananas * 0.49) + (numPears * 2.25));
      double seniorDiscount = 0.10;
      double memberDiscount = 0.15;
      
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
      
		System.out.println("You have " + numApples + " apples, " + numOranges 
		+ " oranges, " + numBananas + " bananas, and " + numPears + " pears.");
		System.out.printf("The total amount is %.2f.\n", totalCost);
		System.out.println("Thank you, have a nice day.");
		}
}