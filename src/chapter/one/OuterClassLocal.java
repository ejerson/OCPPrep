package chapter.one;

public class OuterClassLocal {

    private String hi = "Hello ";


    public void saySomething() {

      /** Effectively FINAL => variable value is not altered anywhere */
      String earth = "World";

      /** explicitly FINAL */
      final String exclaim = "!!!!!!!!!";

      /**
       *   > defined within a method
       *   > exist only when a method is invoked
       *   > NO access modifier or static fields or methods
       *   > CAN"T
       *      * be declared static
       *      * access local variables UNLESS said variables are EFFECTIVELY FINAL
       *
       * */
      class LocalInner {
        public void sayIt() {
          /** Can access EFFECTIVELY FINAL local variables*/
          System.out.println(hi + earth + exclaim);
        }
      }

      LocalInner inner = new LocalInner();
      /** Instance of Local inner now exist */
      inner.sayIt();

    }

  public static void main(String[] args) {
    OuterClassLocal outer = new OuterClassLocal();
    outer.saySomething();
  }


}
