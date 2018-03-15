package chapter.one;


/** Never do this in real life LOL */
public class MultiNestedClasses {

  private int x = 10;

  class B {
    private int x = 20;

    class C {
      private int x = 30;
      private void allTheX() {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(B.this.x);
        System.out.println(MultiNestedClasses.this.x);
        System.out.println(C.this.x);
      }

    }


  }

  public static void main(String[] args) {
    MultiNestedClasses multiNestedClasses = new MultiNestedClasses();
    MultiNestedClasses.B b = multiNestedClasses.new B();
    MultiNestedClasses.B.C c = b.new C();
    c.allTheX();
  }

}
