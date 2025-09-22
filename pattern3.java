public class pattern3 {
    public static void main(String[] args){
        int j,i;
        for (i=1;i<=5;i++){
            for(j=5;j>=i;j--){
                System.out.print(" ");
            }
           for(int k=1;k<=i;k++){
            System.out.print("*");
           }
           System.out.println();
        } 
    }
}