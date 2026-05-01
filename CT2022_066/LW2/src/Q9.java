import java.util.Scanner;

import static javax.swing.text.html.HTML.Attribute.N;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Amount:");
        double p = sc.nextDouble();

        System.out.print("Enter Interest:");
        double R = sc.nextDouble();

        System.out.print("Enter years:");
        int N = sc.nextInt();

        double amount = p * Math.pow(1+(R/100),N);

        System.out.println("Amount after " + amount);
    }
}
