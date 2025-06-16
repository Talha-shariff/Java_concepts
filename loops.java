public class loops {
    public static void main(String[] args) {
        // int i =1;
        // while(i<=10){
        //     System.out.println("hi " + i);
        //     int j = 1;
        //         while(j<=5){
        //             System.out.println("hello "+ j);
        //             j++;
        //         }
        //     i++ ;
        // }
        // System.out.println("bye " + i);
        // // hence the i variable with value holding 11 printsout
        // int x = 5 ; 
        // do { 
        //     System.out.println("psych "+x);
        //     x++;
        // } while (x>10);
        // the condition is false hence it will print the statment 1 time
        // for loop   for (int i = 0; i < 10; i++)
        // for (int i = 10; i > 0; i--) { 
        //     // prints reverse
        //     System.out.println("hi " + i);
        // now we use nested loops simply to just build basic calender having seven days a week and each day a schedule of 9 to 5 }
        for(int i=1; i<=5; i++ ){
            System.out.println("day " + i);
            for(int j = 1; j<=9 ; j++){
                System.err.println(" " + (j+8) +" -- "+(j+9));  
                // (j+8) why did we use the sum into the parenthesis because usually into the empty string it will just concatenate the numbers it will not add, but by using the parenthesis  we can just simply add it coz the things now here work based on the priority
            }
            // here the idea of using the nested for loops was to create a basic scheduler where in 1 hour in a span of the worktime we can just alot our work time 
        }
        
    }
}
