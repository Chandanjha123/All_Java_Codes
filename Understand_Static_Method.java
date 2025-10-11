public class Understand_Static_Method {

    private String word;
    protected String word2="I am protected";
    public String word3="I am Public";
    public static void main(String[] args) {

        InnerUnderstand_Access_Specifier ias=new InnerUnderstand_Access_Specifier();
       OuterClass oc=new OuterClass();
      
        
    }

    public void setter(String word){
        this.word=word;
    }

    public void getter(){
        System.out.println(word);
    }




    static class InnerUnderstand_Access_Specifier {
        public InnerUnderstand_Access_Specifier() {
            // To access 'word', we need an instance of the outer class
            Understand_Static_Method outer = new Understand_Static_Method();
            // System.out.println(outer.word);
            

        }
    }
}

class OuterClass extends Understand_Static_Method {

    public OuterClass() {
        // super();
        // Accessing a non-static member from a static context requires creating an instance of the outer class
        Understand_Static_Method outerInstance = new Understand_Static_Method();
        System.out.println(outerInstance.word2);
        System.out.println(outerInstance.word3);

        outerInstance.setter("I am Private");
        outerInstance.getter();//I am Private
    }


    
}
