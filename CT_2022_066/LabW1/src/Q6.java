import javax.swing.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter width: ");
        int W = scanner.nextInt();
        System.out.println("Enter Height:");
        int H = scanner.nextInt();
        System.out.println("Enter title:");
        String title = scanner.nextLine();

        JFrame myWindow = new JFrame();
        myWindow.setSize(W,H);
        myWindow.setVisible(true);
        myWindow.setTitle(title);
    }
}
