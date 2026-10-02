import java.util.*;
public class Square
{
          public static void main(String args[])
	   {
                         Scanner Q= new Scanner(System.in);
                         int num,i,sum=0;
                         System.out.println("enter a number till square sum needed");
                         num= Q.nextInt();
                         for(i=1;i<=num;i++)
			{
                            int ans;
                            ans=i*i;
                            System.out.print(ans + " + ");
                            sum=sum+ans;

			}
                       System.out.print("="+sum);

                         
	   }
}