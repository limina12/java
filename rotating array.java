/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int a[][]=new int[row][column];
		int tran[][]=new int[column][row];
		int i,j;
		for(i=0;i<row;i++)
		{
		    for(j=0;j<column;j++)
		    {
		        a[i][j]=sc.nextInt();
		    }
		}
		for(i=0;i<column;i++)
		{
		    for(j=0;j<row;j++)
		    {
		        tran[i][j]=a[j][i];
		    }
		}
			for(i=column-1;i>=0;i--)
		{
		    for(j=0;j<row;j++)
		    {
		        System.out.print(tran[j][i]+" ");
		    }
		    System.out.println();
		}
	}
}
