import java.util.Scanner;

public class BankInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble();

        double[] interestRates = {0.02, 0.03, 0.04, 0.05};

        for (int i = 0; i < interestRates.length; i++) {
            double rate = interestRates[i];
            double currentBalance = balance;

            System.out.printf("%nWith an initial balance of %.2f at an interest rate of %.2f%n", balance, rate);

            for (int year = 1; year <= 4; year++) {
                currentBalance += currentBalance * rate;
                System.out.printf("After year %d balance is %.4f%n", year, currentBalance);
            }
        }

        System.out.println("\n---- Operation complete. ----");
        input.close();
    }
}

