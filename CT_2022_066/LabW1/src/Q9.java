import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Sentence: ");
        String sen = scanner.nextLine();

        System.out.println(sen.length());
        System.out.println(sen.substring(0,1));
        System.out.println(sen.charAt(sen.length() - 1));

    }
}

