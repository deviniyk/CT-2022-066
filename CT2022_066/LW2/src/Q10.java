import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter loan amount:");
        double loanAmount = sc.nextDouble();

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = sc.nextDouble();

        System.out.print("Enter loan period (years): ");
        int loanPeriod = sc.nextInt();

        int MONTHS_IN_YEAR = 12;
        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;

        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;

        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow( 1 /(1 + monthlyInterestRate), numberOfPayments) );

        double totalPayment = monthlyPayment * numberOfPayments;

        System.out.println("Monthly Payment = " + monthlyPayment);
        System.out.println("Total Payment = " + totalPayment);

    }
}
