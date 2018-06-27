import java.util.*;
public class sample1 {
    public static void main(String args[])
    {
        sample1 obj=new sample1();
    
        Scanner sc=new Scanner(System.in);
        int n1;
        n1 = sc.nextInt();
        int val=obj.check(n1);
        System.out.println(val);
}
    int check(int n1)
    {
        if(n1==0)
        {
            return 1;
        }
        if(n1%2==0)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }
}
