public class Excep {
    public static void main(String[] args) {
        // this will div the number
        // int i = 9;
        // now we will have a exception where i=0;
        int i=2;
        int j = 0;
        int nums []= new int[5];
        String str = null;

        try{
             j = 18/i;
            //  here the str is wrong and also the nums[5] but that catch block will not be printed coz first error is with the str so 
            //  System.out.println(str.length());
             System.out.println(nums[1]);
             System.out.println(nums[5]);
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide with 0 ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("you are crossing the limit in array "+e);
        }
        catch(Exception e){
            System.out.println("something went wrong may be while trying to access the length of the string  "+e);
        }
        // if theres error then the value of j=0; will be printed 
        // if no error then 
        System.out.println(j);
        System.out.println("statement printed after the try or the catch");
    }
}
