// 1. // we are creating the innerclasses
// class A{
//     public void show(){
//         System.out.println("in class a");
//     }

//      static class B{
//         public void show1(){
//             System.out.println("in class b");
//         }
//     }
// }

// 2.
    //    anonymous class 
    // what if we just creat an abstract class and we just dont wanna extend that method and also we can just create an method while declaring the object itseld
    abstract class Anony{
        public abstract void show();
        // we can just call out this mehtod into the object itself while not extending the parent
    }
public class Moreonclass {
    public static void main(String[] args){
        // // here to we cannot create an object of the inner class directly as it is not directly accessible
        // A obj = new A();
        // obj.show();
        // // now to call the inner class either we can create an refernce of A then call the obj.b to assert it 
        // // or declare the innerclass as static as to call by the class name
        // // A.B obj1 = obj.new B(); ... you can create the object of the inner class when you dont declare the class as static
        // A.B obj1 = new A.B();
        // obj1.show1();

        // 2. anonymous
        Anony obj = new Anony() {
            // anonymous class 
            public void show(){
                System.out.println("hey im into the anonymouss clsss");
            }
        };
        obj.show();
    }
}
