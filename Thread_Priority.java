public class Thread_Priority extends Thread {

    public void run(){
        Thread.currentThread().setPriority(MAX_PRIORITY);;
        System.out.println(Thread.currentThread().getPriority());

    }
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getPriority());
        Thread_Priority t1=new Thread_Priority();
        t1.setName("Solo");
        t1.start();
        
    }
}
