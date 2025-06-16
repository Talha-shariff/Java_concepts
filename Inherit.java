import tools.vadv;

class Inherit{
    public static void main(String[] args){

        vadv obj = new vadv();
        int r1=obj.add(78,23);
        int r2=obj.sub(78,23);
        int r3=obj.mul(78,23);
        int r4=obj.div(78,23);
        double r5=obj.pow(78,23);
        System.out.println(r1+" " +r2+" "+r3+" "+r4+" "+r5);
    }

}
// here totally we have covered all the concepts of the inheritance 
// we have used the inheritance, single level, multiple and all
// inheritance is accessed by the extends keyword and different methods have been creted to be having the different opertaions and all the last child which inherits all of the properties of its parent classes that childs object will be created and then it will be called
// and for the inheritance u dont even need the java file just class file will be sufficient