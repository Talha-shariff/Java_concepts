class A extends Object{
    public A(){
        //  here it comes here sees there is a that extends the object and will call it 
        System.out.println("in a");
    }
    
    public A(int a){
        // after b it comes here and see here is this method and straight away  goes up
        this();
        System.out.println("in a int ");
    }
    
    
}
class B extends A{
    public B(){
        // here this super will has no value and it will call the a which is has value
         super(5);
        System.out.println("in B");
    }
    
    public B(int a){
        // super(5);
        // this goest to b which is up
        this();
        System.out.println("in b int");
    }
    
    
}
public class ThisandSuper {
    public static void main(String [] args){
        // here the object is is not null or default and has some value to it so first it will go to the b constructor which has the value and will call the constructors which has the this or the super method
        B obj = new B(5);
    }
    
    
}