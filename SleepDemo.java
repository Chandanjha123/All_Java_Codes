public class SleepDemo extends Thread {

    public void run(){
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(i+ " : "+ Thread.currentThread().getName());
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        SleepDemo t=new SleepDemo();
        t.start();
        SleepDemo t1=new SleepDemo();
        t1.start();  
    }
}
