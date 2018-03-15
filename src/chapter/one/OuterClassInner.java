package chapter.one;

public class OuterClassInner {

  private static String sOuter = "Hello";

  public String outerMethod() {
    return "I'm from outside";
  }

  // can use any access modefier
  public class MemberInnerClass {

    // cannot have static variables or methods

    // can use static or non-static variables from the outer class
    String sInner = sOuter;

    // can use static or non-static methods from the outer class
    String communication = outerMethod();

    public void innerMethod() {
      System.out.println("I'm Inside!");
    }
  }

  public void callInner() {
    // to instantiate a member "inner class",
    // it cannot be done inside a main method because of its non-static nature
    MemberInnerClass inner = new MemberInnerClass();
    inner.innerMethod();
    System.out.println(inner.communication);
  }

  public static void main(String[] args) {
    OuterClassInner outer = new OuterClassInner();
    outer.callInner();
  }

}


