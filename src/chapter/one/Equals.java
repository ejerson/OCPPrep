package chapter.one;

public class Equals {

  public static void main(String[] args) {
    String s1 = new String("Watsup");
    String s2 = new String("Watsup");

    System.out.println(s1.equals(s2));
    // true => check if values are the same

    StringBuilder sb1 = new StringBuilder("World!");
    StringBuilder sb2 = new StringBuilder("World!");

    System.out.println(sb1.equals(sb2));
    // false => uses .equals() implementation
    // from Object, which simply checks if
    // two objects references being compared points to the same object


  }


  @Override
  public boolean equals(Object obj) {
    // checks to see if an object is of the same class
    if (!(obj instanceof Equals)) return false;
    return true;
  }

  // Use Apache Commons Lang to make overriding equals more convenient
//  @Override
//  public boolean equals(Object obj) {
//    // to check all instance variables
//    return EqualsBuilder.reflectionEquals(this, obj);
//  }
}
