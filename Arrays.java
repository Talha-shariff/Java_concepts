class Student{
 int rollno;
 String name;
 int marks ;  
}
public class Arrays{
    public static void main(String a[]){
        // creating a static array
        // int num1 [] = {12, 23 , 34};
        // num1[2] = 45;
        // System.out.println(num1[2]);
        // .... creating a dynamic array
        // int num2[] = new int[5];
        // num2[0] = 21;
        // num2[1] = 14;
        // num2[2] = 42;
        // num2[3] = 25;
        // num2[4] = 32;
        // // what if i want to call all of the values
        // for(int i = 0 ; i<=5 ; i++){
        //     System.out.println(num2[i]);
        // }
//Multidimensional arrays
        // int nums[][]=new int[3][4];
        // for(int i=0;  i<3 ; i++){
        //     for(int j=0; j<4; j++){
        //         nums[i][j] = (int)(Math.random()*100);
        //     }
        // }
        // for(int i=0;  i<3 ; i++){
        //     for(int j=0; j<4; j++){
        //         System.out.print(nums[i][j] + " ");
        //     }
        //     // the below is to print the new line after every row elements have been assigned
        //      System.out.println();
        // }
        // jagged and 3d array
        // we assign the row size but the column size stays dynamic
        // int nums[][]=new int[3][];
        // nums[0] = new int[3];
        // nums[1]= new int [4];
        // nums[2]= new int [2];
        // for(int i=0;  i<nums.length ; i++){
        //     for(int j=0; j<nums[i].length; j++){
        //         nums[i][j] = (int)(Math.random()*100);
        //     }
        // }
        //     // using an enhanced for loop
        //         for(int n[]:nums){
        //             for(int m : n){
        //                 System.out.print(m + " ");
        //             }
        //             System.out.println();
        //         }
        //         // to use the 3d arrays
        //         int num1[][][]=new int [3][4][5];
   
//    using the arrays for the objects
Student s1 = new Student();
s1.rollno = 55 ;
s1.name= "Mohammed Talha shariff";
s1.marks = 99;

Student s2 = new Student();
s2.rollno = 51 ;
s2.name= "Mohammed Adeeb";
s2.marks = 88;

Student s3 = new Student();
s3.rollno = 56 ;
s3.name= "Mohammed Zaid";
s3.marks = 80;

// we have declared the objects here its time that we create a array for em
Student student[] =  new Student[3];
// here what we have did is instead of the int we have class that already has the variables store in it 
student[0]=s1;
student[1]=s2;
student[2]=s3;
// for(int i = 0; i<student.length; i++){
//     System.err.println(student[i].rollno +" "+ student[i].name +" : "+student[i].marks);
// }
// using the enhanced for loop also known as the for each loop also increases the efficiency
 for(Student stud : student){
    System.out.println(stud.rollno +" "+ stud.name +" : "+stud.marks);
 }

    }
}
