import javax.swing.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your firstName");
        String firstName = scanner.next();

        System.out.println("Enter your lastName");
        String lastName = scanner.next();

        JFrame myWindow = new JFrame();
        myWindow.setSize(800, 600);
        myWindow.setVisible(true);
        myWindow.setTitle(firstName+" "+lastName);
    }
}
