abstract class Abstract {

    abstract void hello();

    public void run(){
        System.out.println("This method is running");
    }

    public static void main(String[] args){

        Abstract2 ab2=new Abstract2();
        ab2.hello();
        ab2.run();

    }
}

class Abstract2 extends Abstract{
    void hello(){
        System.out.println("Hello World.....!");
    }
}
