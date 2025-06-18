// in this we are using both the lambda and the functionalinterface
// lamda is the syntactical sugar and reduces the code 
@FunctionalInterface
interface A{
    int add(int i, int j);
}
// in the anonymous inner class the code has been reduced 
// also look there was also no need to declare the type in the object parenthesis
public class lamb {
 public static void main(String[] args) {
    A obj = (i,j)-> i+j;
    int res = obj.add(5,4);
    System.out.println(res);
 }   
}
