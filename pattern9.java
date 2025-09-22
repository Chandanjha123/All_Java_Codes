public class pattern9 {
    public static void main(String[]args ){
        int i,j;
        for(i=1;i<=5;i++){
            for(j=4;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i>=2 && k>1){
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
