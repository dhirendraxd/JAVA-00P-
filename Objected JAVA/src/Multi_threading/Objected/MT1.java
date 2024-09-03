class MyThread extends Thread {
    // The run method contains the code to be executed by the thread
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " from " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Pause for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MT1 {
    public static void main(String[] args) {
        // Creating two threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        
        // Naming the threads
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        
        // Starting the threads
        t1.start(); // we use start to execute the progrma cause thread  class has start method which is used to start the thread
        t2.start(); // same goes for this thread
    }
}
