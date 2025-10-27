/* 
public class OOPS {

    public static void main(String[] args){
        Pen p1 = new Pen(); // created a pen object called p1
         p1.setColor("Blue");
        System.out.println(p1.color); 
        p1.setTip(6);
        System.out.println(p1.tip);
        p1.color="Yellow";
        System.out.println(p1.color);

        Bankaccount myAcc = new Bankaccount();
        myAcc.username = "vikas pradhan";
        myAcc.setPassword("xyz");

    }
}
  
class Pen{
String color;
int tip;

void setColor(String newColor){
    color = newColor;
}
void setTip(int newTip){
    tip = newTip;
}
}

class Student{
    String name;
    int age;
    float percentage;

    void calcpercentage(int phy, int chem, int math){
     percentage = (phy + chem + math)/3;  
    }
}
class Bankaccount{
    public String username;
    private String password;
     public  void setPassword(String pwd){
       password =pwd;
     }
}
*/

/* 
//constructor..
public class OOPS {

public static void main(String[] args) {
//     Student s1= new Student("Vikas");
//     System.out.println(s1.name);

Student s1 =new Student();
}
    
}
class Student{
    String name;
    int roll;
    // Student(String name){  //constructor create(parameterrized constructor)
    //     this.name=name;
    // }

    Student(){  //(non parameteriz constructor)
        System.out.println("constructor is called");
    }
}
*/

 /* 
//copy constructor

public class OOPS {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "vikas";
        s1.roll = 456;
        s1.password = "abcd";
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;

        Student s2 = new Student(s1);  // Deep copy of s1
        s2.password = "xyz";

        // Changing s1's marks won't affect s2 now
        s1.marks[2] = 100;

        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int roll;
    String password;
    int[] marks;

    // Default constructor
    Student() {
        marks = new int[3];
    }

    // shallow copy constructor
    // Student(Student s1) {
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks;
    //     
    // }

    //Deep copy 
    Student(Student s1) {
        this.name = s1.name;
        this.roll = s1.roll;
       
        this.marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
*/

//-----------------------------------------Inheritance----------------------------------

/* single level iheritance..

public class OOPS {

    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
 //derived or subclass 

 class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swiming in water");
    }

 }
    */


    /*multilevel inheritance ...................

    public class OOPS {

    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.legs =4;
        System.out.println(dobby.legs);
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class memmal extends Animal{
    int legs;
}
class Dog extends memmal{
    String breed;
}
    */


/* hierarchical inheritance....... 

 public class OOPS {

    public static void main(String[] args) {
      memmal human =new memmal();
      human.eat();
      human.breathe();
      
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class memmal extends Animal{
    void walks(){
        System.out.println("walks");
    }
}
class birds extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
  */
  
  

/*Polymorphism........................
 
// Method overloading......
 public class OOPS {
 
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
         System.out.println(calc.sum((float)1.2,(float)2.4));
         System.out.println(calc.sum(1,2,3));
    }
 }

 class Calculator{
    int sum (int a,int b){
        return  a+b;
    }
    float sum (float a,float b){
        return   a+b;
    }
    int sum (int a,int b,int c){
        return   a+b+c;
    }
 }*/

 /* 
 //method overriding.....
 public class OOPS {
 
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat();
    }
 }
 class Animal{
    void eat(){
               System.out.println("eat anything");
    }
 }
 class Deer extends Animal{
    void eat(){
        System.out.println("eat grass");
    }
 }
    */

    /* Abstraction......................................
    public class OOPS {
    
        public static void main(String[] args) {
        //     horse h = new horse();
        //     h.eat();
        //     h.walks();
        //    System.out.println( h.color);

            // Chiken c = new Chiken();
            // c.eat();
            // c.walks();

            mustang mt = new mustang();
            //animal--> horse--> mustang
        }
    }
    abstract class Animal{
        // Animal(){
        //     System.out.println("animal constructor called");
        // }
        String color;
        Animal(){
            color ="brown";
        }
        void eat(){
            System.out.println("animal eat");
        }
        abstract void walks();
    }
    class horse extends Animal{
         horse(){
            System.out.println("horse constructor called");
        }
        void changeColor(){
            color = "dark brown";
        }
        void walks(){
            System.out.println("walk in 4 legs");
        }
    }
    class mustang extends  horse{
         mustang(){
            System.out.println("mustang constructor called");
        }
    }
    class Chiken extends Animal{
        void changeColor(){

        }
        void walks(){
            System.out.println("walks in 2 legs");
        }
    }
    */