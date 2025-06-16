class stu{
    // here the thinggs which we are defining is in the private var and they cannot be accessed by the other classses or by creaitinng any other object
    // this is called encapsulation
    private String name ; 
    private int age ;
// we have created this default constructor which takes the class name and doesnt return anything
    public stu(){
        name = "talha";
        age = 21;
    }
    // weve created this parameterised constructors which has the values as arguments will be called
    public stu(int age, String name){
        this.age = age;
        this.name = name;
    }
    // to access the values first we need to get and set the value by creating there methods and then we can just simply call these methods
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name ;
        // here we use this coz it represents the current object 
        // and if we wanna use the same name which is "name " then we use this

    }
    public int getage(){
        return age;
    }
    public void setAge(int age){
        this.age = age ; 
        // here if we are using any type in the method then we have to return it or else we use void
    }
}
class Constructors{
    public static void main (String args[]){
        stu obj = new stu( );
        stu obj1 = new stu(21,"zaid");
        // obj.setName("Mohammed Talha shariff");
        // obj.setAge(21);
        System.out.println(obj.getName()+" : "+obj.getage());
        System.out.println(obj1.getName()+" : "+obj1.getage());
    }
}