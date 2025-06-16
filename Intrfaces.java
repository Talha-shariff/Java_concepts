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
   abstract class Computer{
    public abstract void code();
}

class Laptop extends Computer{
    public void code(){
        System.out.println("coding, compilling, and running in laptop");
    }
}
class Desktop extends Computer{
    public void code(){
        System.out.println("coding, compilling, and running in PC");
    }
}
class Developer {
    // here the code method has already inherited the computer class
    public void code(Computer val){
        val.code();
    }
}
public class Intrfaces {
    public static void main(String[] args){

       Computer lap = new Laptop();
       Computer desk = new Desktop();
       Developer Talha = new Developer();
       Talha.code(lap);
       Talha.code(desk);
    }
}
 