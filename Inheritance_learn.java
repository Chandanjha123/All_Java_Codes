public class Inheritance_learn {

    void show() {
        System.out.println("I am Inheritance_learn ");
    }

    public static void main(String[] args) {
        Inheritance_learn il = new Inheritance_learn();
        il.show();
        System.out.println("=========================================");
        
        A a=new A();
        a.show();
        a.show2();
        System.out.println("==========================================");

        B b=new B();
        b.show();
        b.show3();
    }
}

class A extends Inheritance_learn {
    void show2() {
        System.out.println("i am A class");
    }

}

class B extends Inheritance_learn {
    void show3() {
        System.out.println("i am B class");
    }

}
