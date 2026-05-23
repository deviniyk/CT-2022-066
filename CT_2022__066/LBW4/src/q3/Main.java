package q3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter inner radius: ");
        double ri = input.nextDouble();

        System.out.print("Enter outer radius: ");
        double ro = input.nextDouble();

        Circle innerCircle = new Circle(ri);
        Circle outerCircle = new Circle(ro);

        double shadedArea = outerCircle.computeArea() - innerCircle.computeArea();

        System.out.println("Shaded Area: " + shadedArea);

    }
}
