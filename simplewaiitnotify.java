public class simplewaiitnotify {
    private boolean issignal = false;
    public synchronized void waitForSignal() {
        while (!issignal) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt(); 
            }
        }
        issignal = false;
    }

   
}
