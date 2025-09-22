public class pattern1 {
    public static void main(String [] args){
        int j,k;
        for(int i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
        for(k=4;k>=i;k--){
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
