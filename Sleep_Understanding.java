public class Sleep_Understanding  {
    public static void main(String[] args) {
        // for (int i = 1; i <= 5; i++) {

        //     try{
        //         Thread.sleep(1000);
        //         System.out.println(i);
        //     }catch(InterruptedException e){
        //         System.out.println(e);
        //     }
            
        // }
        InnerSleep_Understanding Iu=new InnerSleep_Understanding();
     
        for (int i = 1; i <= 5; i++) {
             System.out.println(Thread.currentThread().getName());
            System.out.println(i);
        }
        Thread t=new Thread(Iu);
        t.start();
    }
}

class InnerSleep_Understanding implements Runnable {

    public void run(){ // we cannot throws exceptopn here 
            for(int i=1;i<=5;i++){
                try{
                    System.out.println(Thread.currentThread().getName());
                    Thread.sleep(2000);
                    System.out.println(i*2);
                }catch(Exception e){System.out.println(e);}
            }
    }

    
}
