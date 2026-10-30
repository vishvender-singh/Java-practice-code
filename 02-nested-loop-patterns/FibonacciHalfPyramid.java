public class FibonacciHalfPyramid 
{
    public static void main(String[] args) 
    {
        int i, j, a = 1, b = 1, c;
        for (i = 1; i <= 5; i++) 
        {
            for (j = 1; j <= i; j++) 
            {
                System.out.print(a + "\t");
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}
