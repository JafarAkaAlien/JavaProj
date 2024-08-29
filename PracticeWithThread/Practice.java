package PracticeWithThread;

class Counter{
    public int counter;
    synchronized void count(){
        counter++;
    }
}


public class Practice {
    public static void main(String[] args) throws InterruptedException {
        
        Counter myCounter = new Counter();

        Runnable obj = () -> {
            for(int i=0; i<200; i++){
                myCounter.count();
                System.out.println("thread1");
            }
        };
        Runnable obj2 = () -> {
            for(int i=0; i<200; i++){
                myCounter.count();
                System.out.println("thread2");
            }
        };

        Thread t2 = new Thread(obj2);
        Thread t1 = new Thread(obj);
            t1.start();
            t2.start();
            t2.join();
            t1.join();
            System.err.println(myCounter.counter);
    }
}
