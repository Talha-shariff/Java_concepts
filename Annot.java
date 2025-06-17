class A{
    public void show(){
        System.out.println("hey im in a");
    }
}
class B extends A{
    @Override
    // wrong methd name whiel overriding the @overrirde alerts
    public void show(){
        System.out.println("hey im in b whenever i use the wrong method name while overriding the @override alerts me ");
    }
}
public class Annot {
    public static void main(String[] args) {
        
        B obj =new B();
        obj.show();
    }
}
