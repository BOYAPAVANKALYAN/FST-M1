package Activity;

public class Constructor_Main {

    public static void main(String[] args) {
        Activity1_Constructor_Car toyota = new Activity1_Constructor_Car();
        toyota.make = 2014;
        toyota.color = "Black";
        toyota.transmission = "Manual";

        //Using Car class method
        toyota.displayCharacterstics();
        toyota.accelerate();
        toyota.brake();
    }

}
