package q6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Pet[] pets = new Pet[100];
        Dog[] dogs = new Dog[100];
        Cat[] cats = new Cat[100];

        int petCount = 0;
        int dogCount = 0;
        int catCount = 0;

        while (true) {

            System.out.println("\n1. Add Cat");
            System.out.println("2. Add Dog");
            System.out.println("3. Remove Cat");
            System.out.println("4. Remove Dog");
            System.out.println("0. Quit");

            System.out.print("Enter Choice: ");
            int choice = Integer.parseInt(sc.nextLine());

            if (choice == 0) {
                break;
            }

            switch (choice) {

                case 1:

                    Cat cat = new Cat();

                    System.out.print("Enter Cat Name: ");
                    cat.setName(sc.nextLine());

                    System.out.print("Enter Coat Color: ");
                    cat.setCoatColor(sc.nextLine());

                    cats[catCount++] = cat;
                    pets[petCount++] = cat;

                    System.out.println("Cat Added.");
                    break;

                case 2:

                    Dog dog = new Dog();

                    System.out.print("Enter Dog Name: ");
                    dog.setName(sc.nextLine());

                    System.out.print("Enter Weight: ");
                    dog.setWeight(Double.parseDouble(sc.nextLine()));

                    dogs[dogCount++] = dog;
                    pets[petCount++] = dog;

                    System.out.println("Dog Added.");
                    break;

                case 3:

                    System.out.print("Enter Cat Name to Remove: ");
                    String catName = sc.nextLine();

                    for (int i = 0; i < catCount; i++) {

                        if (cats[i].getName().equalsIgnoreCase(catName)) {

                            for (int j = i; j < catCount - 1; j++) {
                                cats[j] = cats[j + 1];
                            }

                            catCount--;

                            System.out.println("Cat Removed.");
                            break;
                        }
                    }

                    break;

                case 4:

                    System.out.print("Enter Dog Name to Remove: ");
                    String dogName = sc.nextLine();

                    for (int i = 0; i < dogCount; i++) {

                        if (dogs[i].getName().equalsIgnoreCase(dogName)) {

                            for (int j = i; j < dogCount - 1; j++) {
                                dogs[j] = dogs[j + 1];
                            }

                            dogCount--;

                            System.out.println("Dog Removed.");
                            break;
                        }
                    }

                    break;

                default:
                    System.out.println("Invalid Choice");
            }
        }

        System.out.println("\n===== CATS =====");

        for (int i = 0; i < catCount; i++) {

            System.out.println(
                    cats[i].getName() +
                            " - " +
                            cats[i].getCoatColor()
            );
        }

        System.out.println("\n===== DOGS =====");

        for (int i = 0; i < dogCount; i++) {

            System.out.println(
                    dogs[i].getName() +
                            " - " +
                            dogs[i].getWeight()
            );
        }

        sc.close();
    }
}
