import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the sentence: ");
        String sen = scanner.nextLine();

        int index = sen.indexOf('!');

        String part1 = sen.substring(0, index);
        String part2 = sen.substring(index + 1);

        System.out.println(part1);
        System.out.println(part2);
    }
}
