import java.util.*;

public class HarmonicSeries 
{
    public static void main(String args[]) 
     {
        Scanner Q = new Scanner(System.in);
        int num, i;
        double sum = 0.0; 
        System.out.println("enter a number till harmonic series sum needed");
        num = Q.nextInt();
        for (i = 1; i <= num; i++) 
         {
            double ans;
            ans = 1.0 / i; 
            System.out.print("1/" + i + " + ");
            sum = sum + ans;
        }

        System.out.print("=" + sum);
    }
}
