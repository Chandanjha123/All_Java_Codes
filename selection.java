public class selection {
    public static void main(String[] args)
    {
        int[] m={12,5,14,6,20};
        int temp;
        for(int i=0;i<m.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(m[j]>m[j+1])
                {
                   temp=m[j];
                   m[j]=m[j+1];
                   m[j+1]=temp;

                }
            }
        }
        for(int i=0;i<m.length;i++)
        {
            System.out.println(m[i]);
        }

    }
}

