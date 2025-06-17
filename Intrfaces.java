// we create interface as an alternative to the abstract classes 
 
    // by default while declaring variables they are having => final, static
    // and in methods there is no need to declare them as public and abstract as they are by default
//  interface A{
//     void show();
//  }
//  class B implements A{
//     public void show(){
//         System.out.println("in class b");
//     }
//  }

// little depth going in abstract classes
//    abstract class Computer{
//     public abstract void code();
// }

// class Laptop extends Computer{
//     public void code(){
//         System.out.println("coding, compilling, and running in laptop");
//     }
// }
// class Desktop extends Computer{
//     public void code(){
//         System.out.println("coding, compilling, and running in PC");
//     }
// }
// class Developer {
//     // here the code method has already inherited the computer class
//     public void code(Computer val){
//         val.code();
//     }
// }

// 3. extending with interfaces 

interface A{
    int age =21;
    String name = "talha";
    void show();
    void config();
}
interface X{
    void run();
}
interface Y extends X{

}
class B implements A,Y{
    public void show(){
        System.out.println("in show");
    }

    public void config(){
        System.out.println("in config");
    }

    public void run(){
        System.out.println("in run");
    }
}
public class Intrfaces {
    public static void main(String[] args){

    //    Computer lap = new Laptop();
    //    Computer desk = new Desktop();
    //    Developer Talha = new Developer();
    //    Talha.code(lap);
    //    Talha.code(desk);

    // 3.creating the objects of the third interface topic
    A obj = new B();
    obj.show();
    obj.config();
    // note here we are referring the obj to A and the  a doesnt have run which is the method of x interfacea and also b can only access when it is referreing a new obj1 to X or Y
    X obj1 = new B();
    obj1.run();
    // here to access the variables we need to call them by the class coz by default they are declared as final or the static
    System.out.println(A.age + " : " + A.name);

    }
}
 