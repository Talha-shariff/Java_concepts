class Calculate{
    // method overloading can happen when we have the same method name but with different number of the parameteres in the mehtod or the type of the parameters
    public int add(int n1, int n2){
       return n1 + n2 ;
    }
      public int add(int n1, int n2, int n3){
       return n1 + n2 + n3;
    }
      public double add(double n1, int n2){
       return n1 + n2 ;
    }
}
public class Methodoverload{
    public static void main(String a[]){
        
     Calculate cal = new Calculate();
    //   int adding =  cal.add(24,32);
    //    System.out.println(adding);
       int adding =  cal.add(24,32,56);
       System.out.println(adding);
    }
}