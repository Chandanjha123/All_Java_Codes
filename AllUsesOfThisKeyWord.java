public class AllUsesOfThisKeyWord {
    

  AllUsesOfThisKeyWord(Test name){
            System.out.println("New Test");
    }

}
class Test{
    void m1(){
                AllUsesOfThisKeyWord alk=new AllUsesOfThisKeyWord(this);

    }
     public static void main(String[] args) {

        Test t =new Test();
        t.m1();
       

        
    }
}
