package chapter.one;

public class EnumTest {

  public static void main(String[] args) {
    Season e = Season.FALL;
    // prints the name of enum
    System.out.println(e.name()); // FALL
    // prints the order in which it is declared
    System.out.println(e.ordinal()); // 3

    System.out.println(e.compareTo(Season.SUMMER));

  }
}

enum Season {

  WINTER, SPRING, SUMMER, FALL

}



