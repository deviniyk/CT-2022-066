import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter body weight: ");
        double bodyWeight = sc.nextDouble();

        double calories = bodyWeight * 19;

        System.out.println("Calories needed per day = " + calories);
    }
}
