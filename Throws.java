public class Throws {
    static{
        System.out.println("class loaded");
    }
    public static void main(String[] args) {
        A obj = new A();
        try{
            obj.show();
        } catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    
}

class A{
    public void show() throws ClassNotFoundException{
        Class.forName("abc");
        // here the above class name is not present 
        // hence will throw error
    }
}
