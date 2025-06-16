class Mobile{
    String brand;
    int model;
    static String name;
    // non static method
    public void show(){
        System.out.println(brand + " : " + model + " : " +name);
    }
    // stati method
    // public static void show1(Mobile obj){
    //     System.out.println(obj.brand + ":"+ obj.model +":"+name);
    // }
    // we are creating the static block
    static{
        name = "phone";
        System.out.println("in the static block");
        // this will be initialised once and needs to create the object to call and it will be called once 
    }
    // creating a constructor to call the other variables
    public Mobile(){
        brand = "";
        model = 200;
    }
}
 


class Stat {
    public static void main (String[] args) throws ClassNotFoundException{
        // if no object created then we need to define it in the special class
        Class.forName("Mobile");
        // Mobile obj = new Mobile();
        // obj.brand = "samsung";
        // obj.model = 2024;
        // // Mobile.name = "A24";
        // obj.show();
// we are using the obj as the arg to be called into the static method 
        // Mobile.show1(obj);
    }
}
// while initialising the static block after initialising it will first load the class and will first print the static block