package chapter.one;

public class OuterClassAnonymous {

  public static void main(String[] args) {
    MoreLocalInner more = new MoreLocalInner();
    more.execute();
    System.out.println(more.execute());
  }

  interface Greeting {
    void sayHi();
  }

  abstract class Celebrate {
    abstract void scream();
  }

  public void hi() {

    /** Verbose way of declaring and instantiating ANONYMOUS INNER CLASS */
    Greeting hello = new Greeting() {
      @Override
      public void sayHi() {
        System.out.println("Hi!");
      }
      /** This is a local variable, the semicolon is required! */
    };

  }

  public void celebrate() {
    /**
     *   > Abstract classes are OK here because a class body is provided
     *
     *   > The class being created is anonymous because it is declared and instantiated in one line
     *   > CANNOT instantiate abstract classes therefore, a new class is created even if
     *     it cannot be seen clearly in the code
     *
     * */
    Celebrate woohoo = new Celebrate() {
      @Override
      void scream() {
        System.out.println("AAAAhhhhhh!!!");
      }
    };
  }

}

class MoreLocalInner {

  interface Plan {
    /** implemented inside an anonymous class */
    String planStudy();
  }


  /** excute() returns a String that is produced by the refine() method */
  public String execute() {

    /** calls the refine() method that accepts a string, and an object */
    return refine("Finish Chapter One ", new Plan() {
      /** implementation of planStudy method from Plan interface */
      public String  planStudy() {
        return "Create Useful easy to follow notes";
      }
    });
  }

  public String refine(String firstPlan, Plan plan) {
    return firstPlan + plan.planStudy();
  }

}