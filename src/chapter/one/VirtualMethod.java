package chapter.one;

public class VirtualMethod {

  public static void main(String[] args) {
    Transportation a = new Motorcycle();
    a.start(); // press gas pedal

    Transportation b = new Bike();
    b.start(); // Start Pedaling
  }

}


abstract class Transportation {
  abstract void start();
}

class Motorcycle extends Transportation {

  public void start() {
    // virtual method invocation
    pressGasPedal();
  }

  private void pressGasPedal() {
    System.out.println("press gas pedal");
  }

}

class Bike extends Transportation {
  public void start() {
    pedalByFoot();
  }

  private void pedalByFoot() {
    System.out.println("Start Pedaling");
  }

}