class A{
    public void show(){

        System.out.println("in A");
    }
}
class B extends A{
     public void show(){
    System.out.println("in B");
}
}
class C extends A{
     public void show(){
    System.out.println("in C");
}
}
public class Poly{
    public static void main(String[] args) {
         A obj = new A();
         obj.show();
         obj = new B();
         obj.show();
         // here the obj is referring to A but in polymorphism it all depends on the object created 
         obj = new C();
         obj.show();
    }
}