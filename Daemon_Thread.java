public class Daemon_Thread extends Thread{
    public void run(){
       if(Thread.currentThread().isDaemon()){
          System.out.println("I am Daemon Thread");
        System.out.println(Thread.currentThread().isDaemon());
        System.out.println(Thread.currentThread().isAlive());

       }else{
        System.out.println("Normal Thread");
       }
    }

    public static void main(String[] args) {

        System.out.println("I am main thread");
        Daemon_Thread t=new Daemon_Thread();
        t.setDaemon(true);
        t.setName("Solo");
        t.start();
    }
}
