import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner as=new Scanner(System.in);
		    String s1=as.nextLine();
		    int len=s1.length();
		    int count=0;
		for(int i=0;i<len/2;i++)
		{
		    if(s1.charAt(i)!=s1.charAt(len-i-1))
		    {
		        count++;
		    }
		}
		if(count<=2)
		{
		    System.out.println("yes");
		}
		else
		{
		    System.out.println("no");
		}
	}
}
