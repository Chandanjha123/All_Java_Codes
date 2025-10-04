public class UsesSuperKeyword {
    int a = 10;  // parent class variable
}

class A extends UsesSuperKeyword {
    int a = 20;  // child class variable (shadows parent's 'a')

    void show(int a) { // local variable 'a'
        System.out.println(this.a);   // (1)
        System.out.println(super.a);  // (2)
        System.out.println(a);        // (3)
    }

    public static void main(String[] args) {
        A a = new A();
        a.show(30);
    }
}
