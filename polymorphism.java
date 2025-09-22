public class polymorphism {

    //Overloading
    public void method1(int data,String word){

        System.out.println("Data "+data+" String "+word);

    }
    //  public void method1(String word,int  data){

    //     System.out.println("String "+word+" Data " +data);

    // }

    public static void main(String[] args){


        polymorphism poly=new polymorphism();
        poly.method1(1, "I am Odd number");
        polymorphism2 poly2=new polymorphism2();
        poly2.method1(2, " I am Polymorphism 2");

    }
    
}
class polymorphism2 extends polymorphism{


      public void method1(int data,String word){

        System.out.println("Data "+data+" String "+word);

    }

}
