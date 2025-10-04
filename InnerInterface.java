interface InnerInterface {

    abstract void display();
} 

interface NewClass{
    abstract void show();

    default void defaultMethod(){
        System.out.println("I am default method of interface");
        privateMethod();
    }
    private void privateMethod(){
        System.out.println("I am private method of interface");
    }
    
}

class OuterClass implements InnerInterface ,NewClass{
                public void display(){
                    System.out.println("I am InnerInterface");
                }
                public void show(){
                    System.out.println("I am NewClass");
                }


                public static void main(String[] args) {
                    OuterClass obj = new OuterClass();
                    obj.display();
                    obj.show();
                    obj.defaultMethod();
                    
                    
                }
}
