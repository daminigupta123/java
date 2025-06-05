public class multithread {
    public static void main(String[] args) {
        System.out.println("damini");
        Thread t1= new Thread(() -> {
            System.out.println("hello");
            try{
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }        });
        Thread t2 = new Thread(() -> {
            System.out.println("world");
            
                
        
    }
        );
        t1.start();
        t2.start();
    
}}
