enum Laptops{
    Macbook(20000), Asus(30000), Dell(40000) ;
    private int price;
    // constructor
    private Laptops(int price){
        this.price= price;
    }
    // declared the get and setters to use the price var which is in privately dec
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
}
public class Enumarator{
    public static void main(String[] args){
        // Laptops s = Laptops.Macbook ;
        // System.out.println(s +":"+s.getPrice());
        // if i wanna callout all the values simply i would
        for(Laptops laps : Laptops.values()){
            System.out.println(laps+":"+ laps.getPrice());
        } 
    }
    // we can also use the switch statements also
}
