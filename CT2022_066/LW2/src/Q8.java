import java.util.Scanner;

public class Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double volume = (4.0 / 3) * 3.14 * Math.pow(r, 3);

        System.out.println("Volume = " + volume);

    }
}