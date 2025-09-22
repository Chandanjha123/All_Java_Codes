public interface Vehicle {

    void start();

    
} 

interface taxi {

    void color();

    
}

class car implements Vehicle,taxi{


    public void color(){

        System.out.println("The color is yellow");

    }

    public void start(){

        System.out.println("The Car is Started");

    }

    public static void main(String[] args){
        car c=new car();
        c.start();
    }

}