package chapter.one.coding.prompts;

public class EnumPrompt {

  public static void main(String[] args) {
    WeekDays last = WeekDays.TUESDAY;

    switch(last) {
      case MONDAY:
        WeekDays.MONDAY.printHours();
        break;
      case TUESDAY:
        WeekDays.TUESDAY.printHours();
        break;
      case WEDNESDAY:
        WeekDays.WEDNESDAY.printHours();
        break;
      case THURSDAY:
        WeekDays.THURSDAY.printHours();
        break;
      case FRIDAY:
        WeekDays.FRIDAY.printHours();
        break;

    }
  }



  enum WeekDays {
    MONDAY {
      public void printHours() {
        System.out.println("9 - 5");
      }
    }, TUESDAY {
      public void printHours() {
        System.out.println("6 - 8");
      }
    }, WEDNESDAY, THURSDAY, FRIDAY ;

    public void printHours() {
      System.out.println("default hours");
    }
  }



}
