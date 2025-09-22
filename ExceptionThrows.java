import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class ExceptionThrows {
    public static void main(String[] args){

        test t=new test();
        try{
        t.ReadnWrite();
        t.Write();
        }
        catch(Exception e){
            e.printStackTrace();

        }
        System.out.println("Hello motherfucker");

    }
    
}
class test{
    void ReadnWrite() throws FileNotFoundException
    {
        FileInputStream fis=new FileInputStream("test.txt");
        System.out.println("Say My Name");
    }
    void Write()throws FileNotFoundException
    {
        FileOutputStream fos=new FileOutputStream("text.txt");
    }
}
