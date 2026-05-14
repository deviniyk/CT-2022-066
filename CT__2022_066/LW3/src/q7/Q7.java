package q7;

import java.util.Scanner;

public class Q7 {

    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {

            System.out.print("Enter an integer: ");
            int num = input.nextInt();

            if(num < 0) {
                break;
            }

            System.out.println("Number of digits: " + countDigits(num));

        }
    }
}