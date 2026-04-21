import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your firstName");
        String firstName = scanner.next();

        System.out.println("Enter your middlename");
        String middleName = scanner.next();

        System.out.println("Enter your lastName");
        String lastName = scanner.next();

        System.out.println(firstName +" "+middleName.substring(0, 1) + " " + lastName);

    }
}
