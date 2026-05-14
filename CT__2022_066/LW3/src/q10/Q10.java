package q10;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = input.nextLine();

        String reversed = "";

        for(int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        if(text.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
