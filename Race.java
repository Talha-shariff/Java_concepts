public class Race{
    
     public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
         Runnable obj1 = () -> {
            
        for(int i=0; i<100; i++){
         c.increment();
        
    }
        };
        
        Runnable obj2 = () ->{
           
        for(int i=0; i<100; i++){
          c.increment();
        
    }
        };
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // obj1.start();
        t1.start();
        try{
                Thread.sleep(8);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        // obj2.start();... coz now usint the runnable so using the new t1 thread
        t2.start();
t1.join();
t2.join();
System.out.println(c.count);
    }
}
// here the following programs prints for the total times the threads following the increments 
// like 2 objects have been runnig for 100 x 2 = 200
class Counter{
   int count=0;
   public synchronized void increment(){
       count++;
   }
}
