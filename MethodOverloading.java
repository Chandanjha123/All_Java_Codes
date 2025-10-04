public class MethodOverloading {

    void show(int a){
        System.out.println(a);
    }  void show(int a,int b){
        System.out.println(a+"->"+b);
    }
    public static void main(String[] args) {
        MethodOverloading mo=new MethodOverloading();
        mo.show(10);
        mo.show(10,20);
        MethodOverriding mr=new MethodOverriding();
        mr.show(11);
    }
}
class MethodOverriding extends MethodOverloading{

    void show(int a){
        System.out.println(a);
    }

}
