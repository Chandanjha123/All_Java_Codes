public class insertion {
    public static void main(String[] args){
        int[] a={5,1,6,2,4,3};
        int min,j;
        for(int i=1;i<a.length;i++){
           min=a[i];
           j=i;
           while(j>0 && a[j-1]>min){
            a[j]=a[j-1];
            j=j-1;
           }
           a[j]=min;
        }
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
