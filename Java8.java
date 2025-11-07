import java.util.stream.Stream;

/* 

@FunctionalInterface
public interface Java8{
    public void sayHello(); // exactly single abstarct method in functional interface

    // public void sayBye();

    default void sayBye(){ //any no of default & static method

    };
    public static void sayOk(){
        
    };
}
    */
    //#6 vid
    // public interface Java8{
    //     public void sayHello();
    // }
/* #7 video 
    interface A {
    default  void sayHello(){
        System.out.println("hello");
    }
}
    class Child implements A{

    @Override
    public void sayHello() {
       System.out.println("child say hello");
    }


    }
        
    
   public class Java8 {
   public static void main(String[] args) {
    Child c= new Child();
    c.sayHello();
   }
    
   }
   */


  /* 
  interface A {
    default  void sayHello(){
        System.out.println("hello");
    }
}
  interface B {
    default  void sayHello(){
        System.out.println("hello");
    }
}
  public class Java8 implements A,B {
  public static void main(String[] args) {
    Java8 myclass = new Java8();
    myclass.sayHello(); 
  }
  @Override
  public void sayHello(){
    B.super.sayHello();
    //A.super.sayHello();
    //System.out.println("my own implements");
  }
    
  }
  */

  //stream in java8
  public class Java8 {
  public static void main(String[] args) {
    Stream<Integer>limit = Stream.iterate(0, n->n+1).limit(100);
    System.out.println(limit);
  }
    
  }