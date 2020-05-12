public class Car extends Vehicle {

// constructors
  public Car(String brand) {
	    super(brand);
	}

  @Override
  public String doStuff() {
      return "et je fais vroum vroum !";
  }

}
