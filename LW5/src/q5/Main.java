package q5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Dog[] dogs = new Dog[100];

        int petCount = 0;
        int dogCount = 0;

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

                pets[petCount++] = dog;

                dogs[dogCount++] = dog;

            } else if (type == 'c' || type == 'C') {

                Cat cat = new Cat();

                cat.setName(name);

                System.out.print("Enter Coat Color: ");
                String color = sc.nextLine();

                cat.setCoatColor(color);

                pets[petCount++] = cat;
            }
        }

        if (dogCount > 0) {

            double sum = 0;
            double min = dogs[0].getWeight();
            double max = dogs[0].getWeight();

            for (int i = 0; i < dogCount; i++) {

                double weight = dogs[i].getWeight();

                sum += weight;

                if (weight < min) {
                    min = weight;
                }

                if (weight > max) {
                    max = weight;
                }
            }

            double average = sum / dogCount;

            System.out.println("\n===== DOG STATISTICS =====");
            System.out.println("Average Weight = " + average);
            System.out.println("Minimum Weight = " + min);
            System.out.println("Maximum Weight = " + max);

        } else {

            System.out.println("No dogs entered.");
        }

        sc.close();
    }
}
