import java.io.*;
import java.util.*;
class GFG {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6];
        int temp[]=new int[6];
        int i;
        for(i=0;i<6;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int j=1;
        for(i=0;i<6;i+=2)
        {
            temp[i]=arr[6-j];
            j++;
        }
        j=0;
        for(i=1;i<6;i+=2)
        {
            temp[i]=arr[j];
            j++;
        }
        for(i=0;i<6;i++)
        {
            System.out.print(temp[i]+" ");
        }
    }
}
