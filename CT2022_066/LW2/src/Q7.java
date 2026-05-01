import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weight in kg: ");
        int weight = sc.nextInt();

        System.out.print("Enter height in cm: ");
        int height = sc.nextInt();

        //double bmi = weight / (height / 100.0 * 100.0);
        double bmi = weight / Math.pow(height / 100.0, 2);

        System.out.println("BMI = " + bmi);
    }
}