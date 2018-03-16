package chapter.one;

public class OuterClassAnonymous {

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
