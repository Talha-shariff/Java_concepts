public class conditional{
    public static void main(String args[]){
        int x = 20;
        int result = 0 ;
    //     int y = 34 ;
    //     int z = 12;
    //     // if (x > 10 &&  y <= 30)  //here the answer is false as it will use the logic and print the appropriate answer
    //     if(x>y && x>z)
    //         System.out.println(x);
    //     else if (y>x && y>z)
    //         System.out.println(y);
    //     else
    //         System.out.println(z);
    //         // here we can become efficient coder by removing unnecessary conditions in the if statements 
    // 2 . use of the ternary operator
    // if(x%2==0)
    //   result = 10;
    // else 
    // result = 20 ;
    // System.out.println(result);  ... instead we can use the ternary opertor 
    // result = x%2==0 ? 10 : 20 ;
    // System.out.println(result);
    // it works hence only when we are sure that we can use the ternary operator instead of the if else

// 3. switch statement
        String day="monday";
        // String result = "";
        // result =  switch (day) {
        switch(day){
            // case "sunday, saturday" -> System.out.print("college"); 
            // case "sunday, saturday" -> "college";
            // instead we can use the yeild to avoid using the break and arrow 
//             case "monday" -> System.out.print("halfday");    
            // case "monday" -> "halfday"; ... this putting the switch into the result means that we are using the switch as the expression
// // here we are not using the break keyword coz in new version we use the arrow key 
// // if not want to use the arrow and break
// // case "sunday, saturday" : yield System.out.print("college");
//             default ->
//                  System.out.print("error");
        };

    }
}