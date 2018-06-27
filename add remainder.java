import java.util.*;
public class sample1 {
    public static void main(String args[])
    {
        sample1 obj=new sample1();
    
        Scanner sc=new Scanner(System.in);
        int input1=sc.nextInt();
        int input2=sc.nextInt();
        int sum=0;
        int val=obj.addlastdigits(input1,input2);
        System.out.println(val);
}
    int addlastdigits(int input1,int input2)
    {
        int a=input1%10;
        int b=input2%10;
        int sum=a+b;
        return sum;
        
    }
}
