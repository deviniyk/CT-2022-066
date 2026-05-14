package q5;

import java.util.Scanner;

public class Q5 {

    public static void displayEntree() {
        System.out.println("----- Entree -----");
        System.out.println("1. Tofu Burger      - $3.49");
        System.out.println("2. Cajun Chicken    - $4.59");
        System.out.println("3. Buffalo Wings    - $3.99");
        System.out.println("4. Rainbow Fillet   - $2.99");
    }


    public static void displaySideDish() {
        System.out.println("\n----- Side Dish -----");
        System.out.println("1. Rice Cracker     - $0.79");
        System.out.println("2. No-Salt Fries    - $0.69");
        System.out.println("3. Zucchini         - $1.09");
        System.out.println("4. Brown Rice       - $0.59");
    }


    public static void displayDrink() {
        System.out.println("\n----- Drink -----");
        System.out.println("1. Cafe Mocha       - $1.99");
        System.out.println("2. Cafe Latte       - $1.90");
        System.out.println("3. Espresso         - $2.49");
        System.out.println("4. Oolong Tea       - $0.99");
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to MyJava Lo-Fat Burgers!\n");


        displayEntree();
        System.out.print("Choose an entree (1-4): ");
        int entreeChoice = input.nextInt();

        displaySideDish();
        System.out.print("Choose a side dish (1-4): ");
        int sideChoice = input.nextInt();

        displayDrink();
        System.out.print("Choose a drink (1-4): ");
        int drinkChoice = input.nextInt();


        System.out.println("\n----- Your Order -----");
        System.out.println("Entree Choice: " + entreeChoice);
        System.out.println("Side Dish Choice: " + sideChoice);
        System.out.println("Drink Choice: " + drinkChoice);

        System.out.println("\nThank you for ordering!");

        input.close();
    }
}
