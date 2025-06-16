// suppose if i wanna create a class car which has feature drive and play music
// but we are not defining the drive now but its a feature of the car that should be included
// so there we can declare a method instead of definig it 
abstract class Car{
    // we have declare a class abstract but we also need to define the class as abstract also
    public abstract void drive();
    public void music(){
        System.out.println("play music ");
    }
    // there is no compulsion u can either have a abstract class with a abstract mehthod or u can simply have a non abstract mehtod in it 
    // but u should compulsorily call the declared method 
    // u can have multiple method too
}
// now if you create an abstract method you need to compulsory define it by extendign the parent class
abstract class Wagon extends Car{
    public abstract void fly();
    public void drive(){
        System.out.println("driving...");
    }
}
class UpdatedWagon extends Wagon{
    public void fly(){
        System.out.println("car is flying..");
    }
}
public class Abst {
    public static void main(String[] arg){
        // note that you cannot create an object of the class .. but to call it u can create a reference of it and the object of the concrete class
        Wagon obj = new UpdatedWagon();
        obj.drive();
        obj.music();
        obj.fly();
    }
}
