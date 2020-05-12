import java.util.ArrayList;

public class Hangar {

    public static void main(String[] args) {

      Car Clio = new Car("Clio");
      System.out.println("Je suis "+Clio.getBrand()+" "+Clio.doStuff());

      Boat Titanic = new Boat("Titanic");
      System.out.println("je suis "+Titanic.getBrand()+" "+Titanic.doStuff());
    }

}
