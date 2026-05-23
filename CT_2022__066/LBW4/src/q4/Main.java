package q4;


public class Main {

    public static void main(String[] args) {

        // Owner Object
        Owner owner1 = new Owner("Kasun", "0771234567");

        // Bicycle Object
        Bicycle bike = new Bicycle(owner1);

        // Display
        System.out.println("Owner Name: "
                + bike.getOwner().getOwnerName());

        System.out.println("Phone Number: "
                + bike.getOwner().getPhoneNo());
    }
}