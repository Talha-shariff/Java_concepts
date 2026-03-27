import java.util.ArrayList;
public class collections {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<>();
        list.add("Hello");
        list.add("talha");
        list.add("shariff");
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(2);
        System.out.println("there is no name found "+list.contains(2));
        //list.clear();
        list.set(0, "sadiya");
        for(String names : list ){
            System.out.println(names);
        }
        
    }
}
