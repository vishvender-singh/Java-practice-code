import java.util.*;

public class Square 
{
    public static void main(String[] args) 
    {
        Scanner Q = new Scanner(System.in);
        int num, i, ans, sum = 0;
        
        System.out.println("Enter a number till square sum needed:");
        num = Q.nextInt();
        
        for (i = 1; i <= num; i++) 
        {
            ans = i * i;
            sum = sum + ans;
            if (i < num) 
            {
                System.out.print(ans + " + ");
            } 
            else 
            {
                System.out.print(ans + " = " + sum);
            }
        }
        System.out.println();
    }
}
