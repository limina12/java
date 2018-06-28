import java.util.*;
public class test1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,sum=0;
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
      for(i=0;i<arr.length;i++)
      {
          int c=0;
      for(j=1;j<arr.length;j++)
      {
          if(i%j==0)
          {
              c++;
          }
      }
          if(c==2)
          {
              sum=sum+arr[i];
          }
      }
      System.out.print(sum);
      }
    }
