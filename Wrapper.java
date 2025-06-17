class Wrapper{
    public static void main(String [] args){
        int num = 7;
        // autoboxing 
       Integer num1 = num;  
    //    here integer means it is the wrapper
       System.out.println(num1);
    //    auto unboxing
       int num2 = num1;
       System.out.println(num2);

       String str = "12";
    //    the down here it converts it into the int 
       int num3 = Integer.parseInt(str);
       System.out.println(num3*3);

    }

}
