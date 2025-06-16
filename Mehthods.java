class Computer{
    public void Musicplayer(){
        // this method isnt compputing or returnig anything so its a tye of void 
        // if it was int or other type then it will have return
        System.out.println("Music playing..");
    }
    public String getmepen(int cost){
        if(cost >= 12)
        // since the value specified into the object is 12 it will print pen or else nothing
            return "Pen";
            // we can also put this nothing into the else
            // but since you are using a type which will return a value then you have to use the return in the end 
        return "Nothing";

    }
}
public class Mehthods{
    public static void main(String a[]){
        // we create the object of the class 
        Computer com = new Computer();
        com.Musicplayer();
        // since we are returning some value in the string we store it in a variable that will be called 
        String p = com.getmepen(12);
        System.out.println(p);
    }
}