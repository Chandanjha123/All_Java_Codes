import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
public class hashset_duplicate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many number you want to store");
        int num=sc.nextInt();
        System.out.println("enter the "+num+" integer");
        int []a=new int[num];
        for(int i=0;i<num;i++){
            a[i]=sc.nextInt();
        }
        Map<Integer,Integer> hm=new HashMap<>();
        for(int no:a){
            Integer count=hm.get(no);
            if(count==null){
                hm.put(no,1);
            }
            else{
                count=count+1;
                hm.put(no,count);
            }
        }
        System.out.println("the duplicates number are: ");
        Set<Map.Entry<Integer,Integer>> es=hm.entrySet();
        for(Map.Entry<Integer,Integer> me :es){
            if (me.getValue()>1) {
                System.out.println(me.getKey()+" ");
            }
        }
}
}
