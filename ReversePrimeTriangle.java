import javax.swing.*;

public class ReversePrimeTriangle
    {
    public static void main(String args[]) 
        {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Enter no. "));
        int totalPrimes = (num * (num + 1)) / 2;
        
        int lprime = 2;
        
        for (int count = 0, a = 2; count < totalPrimes; a++) 
            {
            int flag = 1;
            for (int b = 2; b <= a / 2; b++) 
            {
                if (a % b == 0) 
                {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) 
           {
                lprime = a;
                count++;
            }
        }
        
        for (int r = num; r > 0; r--) 
          {
            for (int c = 0; c < r; c++) 
            {
                System.out.print(lprime + " ");
                
                lprime--;
                for (; lprime >= 2; lprime--) {
                    int flag = 1;
                    for (int i = 2; i <= lprime / 2; i++) 
                    {
                        if (lprime % i == 0) 
                        {
                            flag = 0;
                            break;
                        }
                    }
                    if (flag == 1) {
                        break;
                    }
                }
            }
            System.out.println();
        }
    }
}