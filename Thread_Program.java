// public class Thread_Program extends Thread  {


//     public void run(){
//         System.out.println("First Thread Program");
//     }
// 	public static void main(String[] args) {
        
//         Thread_Program t = new Thread_Program();
//         t.start();
		
// 	}
// }

public class Thread_Program implements Runnable  {


    public void run(){
        System.out.println("First Thread Program");
    }
	public static void main(String[] args) {
        
        Thread_Program t = new Thread_Program();
        Thread thread = new Thread(t);
        thread.start();
        thread2 t2=new thread2();
        Thread thread2=new Thread(t2);
        thread2.start();
        thread3 t3=new thread3();
        Thread thread3=new Thread(t3);
        thread3.start();
        thread4 t4=new thread4();
        Thread thread4=new Thread(t4);
        thread4.start();
		
	}
}
class thread2 extends Thread {

     public void run(){
        System.out.println("First Thread Program");
    }

    
}
class thread3 extends Thread {

     public void run(){
        System.out.println("Second Thread Program");
    }

    
}
class thread4 extends Thread {

     public void run(){
        System.out.println("Third Thread Program");
    }

    
}