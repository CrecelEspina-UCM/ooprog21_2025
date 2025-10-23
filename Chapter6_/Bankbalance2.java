import java.util.Scanner;

public class Bankbalance2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double balance;
        double interestRate = 0.03; // Default interest rate 3%
        int year = 1;
        int choice;
        
        System.out.print("Enter initial balance: ");
        balance = input.nextDouble();
        
        do {
            // Calculate new balance
            balance = balance + (balance * interestRate);
            
            System.out.printf("After year %d at %.2f interest rate, balance is $%.4f%n", year, interestRate, balance);
            
            System.out.println("\nDo you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();
            
            year++;
        } while (choice == 1);
        
        System.out.println("\n---- Program complete ----");
        
        input.close();
    }
}
