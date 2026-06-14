package q2;

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

            if (type == 'd') {

                Dog dog = new Dog();
                dog.setName(name);

                pets[count] = dog;
                count++;

            } else if (type == 'c') {

                Cat cat = new Cat();
                cat.setName(name);

                pets[count] = cat;
                count++;
            }
        }

        System.out.println("\nPet List");

        for (int i = 0; i < count; i++) {

            System.out.println(
                    pets[i].getName() +
                            " - " +
                            pets[i].speak()
            );
        }

        sc.close();
    }
}
