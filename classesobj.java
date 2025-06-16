class Calculator{
    // in a class we can either create a method or the variable
    // and in that method we create variables that holds the values which are assigned in the obj
    int a;
    // method
    public int add(int n1, int n2){
        int r = n1+n2;
        // after every opeartion we return the value
        return r;
    }
}
public class classesobj{
    public static void main(String args[]){
        int num1 = 178 ;
        int num2 = 279 ;
        // calc is the obj of the class calulator
        Calculator calc = new Calculator();
        // the obj calls the method which holds the variables or we can directly assign the value
        int result = calc.add(num1,num2);
        System.out.println(result); 
    }
}