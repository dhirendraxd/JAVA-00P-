class MyRunnable implements Runnable { // runnable is alos a interface which is used to create threads. it has only one method run which is used to execute the code. 
    @Override
    public void run() {

        System.out.println("Thread started: " + Thread.currentThread().getName());
    }
}

public class runnabel {
    public static void main(String[] args) {

        // Creating Runnable instances
        MyRunnable myRunnable1 = new MyRunnable();
        MyRunnable myRunnable2 = new MyRunnable();
        
        // Creating Thread instances
        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);
        // thread instances are created by passing the runnable instances as arguments to the constructor of the Thread class. this helps in creating threads that can execute the run method of the runnable instances. 
        
        // Naming the threads
        t1.setName("Thread 1");
        t2.setName("Thread 2");

        
        // Starting the threads
        t1.start();
        t2.start();
    }
}
