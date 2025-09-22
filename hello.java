import java.util.Scanner;
public class hello {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a[] = {5, 6,2,8,7,1};
        for(int i=0;i<a.length;i++){
          for(int j = 0; j<a.length-1;j++){
              if(a[j]>a[j+1]){
                  int temp=a[j];
                  a[j]=a[j+1];
                  a[j+1]=temp;
              }
          }
        }
        int l = a.length-1;
        for(int i = 0;i<l;i++){
            System.out.print(a[l]+" " +a[i]+" ");
            l--;
        }
    }
}