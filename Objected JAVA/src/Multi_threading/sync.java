package Multi_threading;
class Counter {
    int count = 0;

    // Synchronized method to ensure thread safety
    public synchronized void increment() {
        count++;
    }
}

public class  sync{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread t1 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();
        // start method is used to start the thread. it is used to execute the code inside the run method of the thread class.

        // Wait for both threads to finish
        t1.join();
        t2.join();
        // join method is used to wait for the thread to finish. it is used to make the main thread wait for the other threads to finish.

        // The final count should be 2000
        System.out.println("Final count: " + counter.count);
    }
}
