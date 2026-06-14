package q3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        int count = 0;

        while (true) {

            System.out.print("Enter Pet Name: ");
            String name = sc.nextLine();

            if (name.equalsIgnoreCase("STOP")) {
                break;
            }

            System.out.print("Enter Type (c/d): ");
            char type = sc.nextLine().charAt(0);

            if (type == 'd' || type == 'D') {

                Dog dog = new Dog();
                dog.setName(name);

                pets[count] = dog;
                count++;

            } else if (type == 'c' || type == 'C') {

                Cat cat = new Cat();
                cat.setName(name);

                pets[count] = cat;
                count++;
            }
        }

        System.out.println("\n===== CATS =====");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {
                System.out.println(pets[i].getName());
            }
        }

        System.out.println("\n===== DOGS =====");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {
                System.out.println(pets[i].getName());
            }
        }

        sc.close();
    }
}
