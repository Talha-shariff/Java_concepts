// creating my own exception name and using it in throwpublic class Excep {
class talhasException extends Exception{
    public talhasException(String str){
        super(str);
    }
}


public class Throw{

    public static void main(String[] args) {
        // this will div the number
        // int i = 9;
        // now we will have a exception where i=0;
        int i=20;
        int j = 0;
        // int nums []= new int[5];
        // String str = null;

        try{
             j = 18/i;
            //  using the throw 
            if(j==0)
            throw new talhasException("this is my own cutom Exception");
        }
        catch(talhasException e){
            j=18/1;
            // above line prints the default value 
            System.out.println("default value " + e);
        }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println("you are crossing the limit in array "+e);
        // }
        catch(Exception e){
            System.out.println("something went wrong may be while trying to access the length of the string  "+e);
        }
        // if theres error then the value of j=0; will be printed 
        // if no error then 
        System.out.println(j);
        System.out.println("statement printed after the try or the catch");
    }
    }