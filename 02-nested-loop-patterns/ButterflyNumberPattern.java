public class ButterflyNumberPattern 
{
    public static void main(String[] args) 
    {
        int i, j, r;
        for (i = 1; i <= 7; i++) 
        {
            r = (i <= 4) ? i : 8 - i;
            for (j = 1; j <= 7; j++) 
            {
                if (j <= r || j >= 8 - r) 
                {
                    System.out.print(j);
                } 
                else 
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
