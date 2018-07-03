/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int i,j,flag=0,flag2=0;
		int count[]=new int[10];
		    for(j=0;j<s.length();j++)
		    {
		        count[s.charAt(j)-'0']++;
		    }
		    for(i=0;i<10;i++)
		    {
                if(count[i]==2)
                {
                    flag++;
                }
                if(count[i]==1)
                {
                    flag2++;
                }
		    }
		    if(flag>=1 && flag2<=1 )
		    {
		        System.out.println("yes");
		    }
		    else
		    {
		        System.out.println("no");    
		    }
		}
	}
