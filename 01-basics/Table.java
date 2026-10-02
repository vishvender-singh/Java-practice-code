import java.util.*;
public class Table
{
          public static void main(String args[])
	   {
                         Scanner Q= new Scanner(System.in);
                         int num,i;
                         System.out.println("enter a number");
                         num= Q.nextInt();
                         for(i=1;i<=10;i++)
			{
                            int ans;
                            ans=num*i;
                            System.out.println(num + " * " + i + "=" + ans);
			}
                         
	   }
}