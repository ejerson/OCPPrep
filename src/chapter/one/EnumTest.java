package chapter.one;

public class EnumTest {

  public static void main(String[] args) {
    Season e = Season.FALL;
    // prints the name of enum
    System.out.println(e.name()); // FALL
    // prints the order in which it is declared
    System.out.println(e.ordinal()); // 3

    System.out.println(e.compareTo(Season.SUMMER)); //1 - SUMMER, 2 - SPRING, 3 - WINTER

    System.out.println(e.getDeclaringClass()); // class chapter.one.Season
    System.out.println(e.getClass()); //class chapter.one.Season




    // Enums may be used in a switch statement

    Season summer = Season.SUMMER;

    switch (summer) {
      case SUMMER:
        // to call a method inside an enum
        Season.SUMMER.printExpectedTemperature();
        break;
      case FALL:
        Season.FALL.printExpectedTemperature();
        break;
      case SPRING:
        Season.SPRING.printExpectedTemperature();
        break;
      case WINTER:
        Season.FALL.printExpectedTemperature();
       break;
    }

  }
}

enum Season {

  WINTER("30 deg"), SPRING("85 deg"), SUMMER("95 deg"), FALL("75 deg");

  private String expectedTemperatures;

  // enum constructors are implicitly private (can't be protected or public)
  private Season(String expectedTemperatures) {
    this.expectedTemperatures = expectedTemperatures;
  }

  public void printExpectedTemperature() {
    System.out.println(expectedTemperatures);
  }

}



