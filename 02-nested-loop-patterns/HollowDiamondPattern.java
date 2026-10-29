public class HollowDiamondPattern 
{
    public static void main(String[] args) 
    {
        int i, j, s;
        for (i = 1; i <= 5; i++) 
        {
            for (s = 1; s <= 5 - i; s++) 
            {
                System.out.print("  ");
            }
            for (j = 1; j <= 2 * i - 1; j++) 
            {
                if (j == 1 || j == 2 * i - 1) 
                {
                    System.out.print(i + " ");
                } 
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for (i = 4; i >= 1; i--) 
        {
            for (s = 1; s <= 5 - i; s++) 
            {
                System.out.print("  ");
            }
            for (j = 1; j <= 2 * i - 1; j++) 
            {
                if (j == 1 || j == 2 * i - 1) 
                {
                    System.out.print(i + " ");
                } 
                else 
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
