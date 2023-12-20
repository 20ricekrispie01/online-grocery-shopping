import java.util.Scanner;

public class Demo
{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        String userName = scnr.nextLine();
        
        System.out.println("What is your age?");
        int userAge = scnr.nextInt();
        scnr.nextLine();
        
        System.out.println("Do you have a store membership? (y/n)");
        String userMember = scnr.nextLine();
        
        Customer customer = new Customer(userName, userAge);
        if (userMember.equalsIgnoreCase("y")){
            customer.setMember(true);
        }
        
        ShoppingCart cart = new ShoppingCart(customer);
        
        System.out.println("How many apples do you want?");
        int appleQuantity = scnr.nextInt();
        Product apple = new Product("Apple", 2.50);
        apple.setQuantity(appleQuantity);
        cart.addProduct(apple);
        
        System.out.println("How many bananas do you want?");
        int bananaQuantity = scnr.nextInt();
        Product banana = new Product("Banana", 0.99);
        banana.setQuantity(bananaQuantity);
        cart.addProduct(banana);
        
        cart.listProducts();
        
        double total = cart.calculateTotal();
        if (customer.getAge() >= 65) {
            SeniorDiscount seniorDiscount = new SeniorDiscount();
            total -= seniorDiscount.applyDiscount(total);
        }
        
        if (customer.isMember()){
            MemberDiscount memberDiscount = new MemberDiscount();
            total -= memberDiscount.applyDiscount(total);
        }
        
        System.out.printf("The total amount is %.2f.\n", total);
        System.out.println("Thank you have a nice day.");
        
        scnr.close();
    }
}
