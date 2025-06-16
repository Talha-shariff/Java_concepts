public class Strings{
    // when you try to declare strings do not make the main class as same name 

    public static void main(String[] args) {
        
        String name = "mohammed";
        // normal way to print a string
        name += " Talha shariff ";
        System.out.println(name);
// using the StringBuffer to use the mutable strings
StringBuffer str = new StringBuffer("Mohammed talha shariff ");
System.out.println(str.capacity());  
// here by printing the capacity of the empty buffer the size is 16 which means it has 16byte of memory saved
 str.ensureCapacity(100);
System.out.println(str );  
 str.insert(2, "hey");
System.out.println(str  );  
    }
    // stringbuilder is same as buffer 
    
}