class consumer {
    public void consume() {
    System.out.println("Consumer is  running");
    }
}
class producer {
    public void produce() {
        System.out.println("Producer is  waiting");
    }
}
public class setpriorityfunction1 {
    public static void main(String[] args) {
        consumer c = new consumer();
        producer p = new producer();
        
        Thread t1 = new Thread(() -> {
            c.consume();
        });
        
        Thread t2 = new Thread(() -> {
            p.produce();
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
    

    }
        }
        
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        
        System.out.println("Thread priorities set: " + t1.getName() + " priority " + t1.getPriority() + ", " + t2.getName() + " priority " + t2.getPriority());
    
}

