public class Inheritance {


    public void method1(){
        System.out.println("I am method1");
    }
    public static void main(String[] args){
        Inheritance i1=new Inheritance();
        // i1.method1(); // I am in method 1
         Inheritance2 i2=new Inheritance2();
        //  i2.method1();
        //  i2.method2();

        Inheritance3 i3=new Inheritance3();
        i3.method1();
        i3.method2();
        i3.method3();
        

    }
    
}
class Inheritance2 extends Inheritance{
    public void method2(){
        System.out.println("I am method2");
    }

}

class Inheritance3 extends Inheritance2 {
    public void method3(){
        System.out.println("I am in method 3");
    }

    
}
