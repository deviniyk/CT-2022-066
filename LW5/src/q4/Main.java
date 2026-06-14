package q4;

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

                System.out.print("Enter Weight: ");
                double weight = Double.parseDouble(sc.nextLine());

                dog.setWeight(weight);

                pets[count] = dog;
                count++;

            } else if (type == 'c' || type == 'C') {

                Cat cat = new Cat();
                cat.setName(name);

                System.out.print("Enter Coat Color: ");
                String color = sc.nextLine();

                cat.setCoatColor(color);

                pets[count] = cat;
                count++;
            }
        }

        System.out.println("\n===== CATS =====");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Cat) {

                Cat cat = (Cat) pets[i];

                System.out.println(
                        "Name: " + cat.getName() +
                                ", Type: Cat" +
                                ", Coat Color: " + cat.getCoatColor()
                );
            }
        }

        System.out.println("\n===== DOGS =====");

        for (int i = 0; i < count; i++) {

            if (pets[i] instanceof Dog) {

                Dog dog = (Dog) pets[i];

                System.out.println(
                        "Name: " + dog.getName() +
                                ", Type: Dog" +
                                ", Weight: " + dog.getWeight()
                );
            }
        }

        sc.close();
    }
}
