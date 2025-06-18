public class Excep {
    public static void main(String[] args) {
        // this will div the number
        // int i = 9;
        // now we will have a exception where i=0;
        int i=0;
        int j = 0;

        try{
             j = 18/i;
        }catch(Exception e){
            System.out.println("cannot divide with 0 ");
        }
        // if theres error then the value of j=0; will be printed 
        // if no error then 
        System.out.println(j);
        System.out.println("statement printed after the try or the catch");
    }
}
