package chapter.one;

public class OuterClassInner {

  private static String sOuter = "Hello";

  public String outerMethod() {
    return "I'm from outside";
  }


  /**
   *  > be abstract or final
   *  > use any access modifier
   *  > access all members of the outer class
   *  > extend any class or implement interfaces
   *
   *  > CANNOT have static variables or methods within
   *
   * */
  public final class MemberInnerClass {

    // cannot have static variables or methods

    // can use static or non-static variables from the outer class
    String sInner = sOuter;

    // can use static or non-static methods from the outer class
    String communication = outerMethod();

    public void innerMethod() {
      System.out.println("I'm Inside!");
    }
  }

  /**
   *  > CANNOT instantiate a member inner class inside a main method because of its
   *  non-static nature
   *
   * */
  public void callInner() {
    MemberInnerClass inner = new MemberInnerClass();
    inner.innerMethod();
    System.out.println(inner.communication);
  }

  public static void main(String[] args) {
    OuterClassInner outer = new OuterClassInner();
    outer.callInner();
  }

}


