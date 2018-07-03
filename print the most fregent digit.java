
import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int i;
		int n=sc.nextInt();
		sc.nextLine();
		String a[]=new String[n];
		int count[]=new int[10];
		for(i=0;i<n;i++)
		{
		    a[i]=sc.nextLine();
		}
		for(i=0;i<n;i++)
		{
		    String s=a[i];
		    for(int j=0;j<s.length();j++)
		    {
		        count[s.charAt(j)-'0']++;
		    }
		}
	int max=count[0],value = Integer.MIN_VALUE;
		for(i=1;i<10;i++)
		{
	   if(max<=count[i] && i>value)
	   {
	       max=count[i];
	       value = i;
	   }
    	}
    	System.out.print(value);
	}
}
