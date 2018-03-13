package chapter.one;

public class SameNamedVariables {

  public static void main(String[] args) {
    Subclass a = new Subclass();
    System.out.println(a.name);
  }
}




class Superclass {
  String name = "SUPER";

}
class Subclass extends Superclass {
  String name = "SUB";
}