// we are commenting this out coz we just dont wanna use the class instead implementing this using the runnable and also using the print in the anonymous clsses
// class A extends Thread{
//     public void run(){
//         for(int i=0; i<100; i++){
//             System.out.println("hi");
//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=0; i<100; i++){
//             System.out.println("hello");
//             try{
//                 Thread.sleep(10);
//             }catch(InterruptedException e){
//                 e.printStackTrace();
//             }
//         }
//     }
// }
public class Threads {
    public static void main(String[] args) {
        Runnable obj1 = () -> {
            
        for(int i=0; i<100; i++){
            System.out.println("hello");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        
    }
        };
        
        Runnable obj2 = () ->{
           
        for(int i=0; i<100; i++){
            System.out.println("hi");
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        
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

    }
}
