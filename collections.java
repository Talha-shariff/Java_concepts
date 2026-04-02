import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
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
        
        Stack <String> stack = new Stack<>();
        stack.push("talha");
        stack.push("sadiya");
        stack.push("shariff");
        stack.push("khanum");
        stack.push("forever");
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
        
        Queue <Integer> que1 = new LinkedList<>();
        que1.offer(1);
        que1.offer(2);   
        que1.offer(3);
        que1.offer(4);
        // System.out.println(que);
        // que.poll();
        // System.out.println(que);
        // System.out.println(que.peek());
        
        Queue <Integer> que = new PriorityQueue<>();
         que.offer(12);
        que.offer(212);   
        que.offer(332);
        que.offer(4);
        System.out.println(que);
        que.poll();
        System.out.println(que);
        System.out.println(que.peek());
        
        Queue <Integer> que2 = new PriorityQueue<>(Comparator.reverseOrder());
         que2.offer(12);
        que2.offer(212);   
        que2.offer(332);
        que2.offer(4);
        System.out.println(que2);
        que2.poll();
        System.out.println(que2);
        System.out.println(que2.peek());
ArrayDeque <Integer> arrde = new ArrayDeque<>();
         arrde.offerLast(12);
        arrde.offer(212);   
        arrde.offerFirst(332);
        arrde.offer(4);
        System.out.println(arrde);
        arrde.poll();
        System.out.println(arrde);
        System.out.println(arrde.peek());

        Set <Integer> s = new HashSet<>();
        s.add(1);
        s.add(323);   
        s.add(3242);
        s.add(42);
        System.out.println(s);

        Set<Integer> s12 = new TreeSet<>();
        s12.add(1);
        s12.add(323);   
        s12.add(3242);
        s12.add(42);
        System.out.println(s12);
    }
}
