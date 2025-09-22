public class pattern14 {
    public static void main(String[] args){
        int i,j;
        for(i=0;i<5;i++){
            for(j=0;j<5;j++){
               if(i>=1 && j>=1 && i<=3 && j<=3){
                System.out.print(" ");
               }
               else{
                System.out.print("*");
               }
            }
            System.out.println();
        }
    }
}
