
package q4;

public class Bicycle {


    private Owner owner;


    public Bicycle() {
        owner = new Owner();
    }


    public Bicycle(Owner owner) {
        this.owner = owner;
    }

    // Getter Method
    public Owner getOwner() {
        return owner;
    }

    // Setter Method
    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}