package chapter.one;

public class PrivateInterfaces {

  /**
   *   > Classes can contain PRIVATE INTERFACES
   *      these type of interfaces can only be referred to within the current outer class
   * */
  private interface Secret {
    // abstract methods of interaces are implicitly public
    public void keepHush();
  }

  class DontSpread implements Secret {
    public void keepHush() {
      System.out.println("Shut up!!!!");
    }
  }

  public static void main(String[] args) {

    // Instantiate the outer class
    PrivateInterfaces pi = new PrivateInterfaces();

    // Instantiate the inner class
    PrivateInterfaces.DontSpread ds = pi.new DontSpread();
    ds.keepHush();

  }


}
