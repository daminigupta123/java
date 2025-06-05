class  MyThread extends Thread {
    public void run() {
        System.out.println(getName()+" Thread is running "+getPriority());
    }
}

public class setpriorityfunction {
    public static void main(String[] args) {
       // System.out.println("damini");
        MyThread t1= new MyThread();
        MyThread t2= new MyThread();
        t1.setName("damini");
        t2.setName("anvi");
        
        
        t1.start();
        t2.start();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
    
}}
