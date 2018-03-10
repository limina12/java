import java.io.*;
import java.util.Scanner ;

class str {
	public static void main (String[] args) {
	    String a,b;
		Scanner as=new Scanner(System.in);
		 a=as.next();
		 b=as.next();
		int c=a.length();
		int d=b.length();
		if(c==d)
		{
		System.out.println("yes");
	}
	else{
	    System.out.println("no");
	}
}
}
