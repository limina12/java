import java.util.*;
public class test1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
       Arrays.sort(arr);
       System.out.println(Arrays.toString(arr));
        
        
    }
    
}
