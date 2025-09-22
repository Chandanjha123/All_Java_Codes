public class prime100 {
    static String input;
    public static void main(String[] args){
            int m=0;
            for(int i=1;i<=100;i++){
                for(int j=2;j<=i-1;j++){
                    if(i%j==0){
                        m=m+1;
                    }
                }
                    if(m==0){
                        System.out.println(i);
                    }
                    else{
                        m=0;
                    }
             }
    }
}
