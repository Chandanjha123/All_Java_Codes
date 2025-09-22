public class MergeSort {
     int temparr[];
     int[] array;
        int length;
    public static void main(String[] args){
         int[] inputarr={10,50,2,30,26,19,94};
         MergeSort ms=new MergeSort();
         ms.sort(inputarr);   
         for(int i:inputarr){
            System.out.println(i+" ");
         }
    }

    public void sort(int[]inputarr){
        this.array=inputarr;
        this.length=inputarr.length;
        this.temparr=new int[length];
        divideArray(0, length-1);
    }
    public void divideArray(int lowerindex,int higherindex){
        if(lowerindex<higherindex){
            int  middle=lowerindex+(higherindex-lowerindex)/2;
            divideArray(lowerindex, middle);
            divideArray(middle+1, higherindex);
            mergeArray(lowerindex, middle, higherindex);
        }
    }
    public void mergeArray(int lowerindex,int middle,int higherindex){
                for(int i=lowerindex;i<=higherindex;i++){
                    temparr[i]=array[i];
                }
                int i=lowerindex;
                int j=middle+1;
                int k=lowerindex;
                while(i<=middle&& j<=higherindex){
                    if(temparr[i]<=temparr[j]){
                        array[k]=temparr[i];
                        i++;
                    }
                    else{
                        array[k]=temparr[j];
                        j++;
                    }
                    k++;
                }
                while(i<=middle){
                    array[k]=temparr[i];
                    k++;
                    i++;
                }
    }
}
