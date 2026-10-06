public class BitwiseCompoundAssignmentOperator
{
      public static void main(String args[])
      {
           int a=15,b=18;
           a&=b;
           System.out.println(a);
           a=15;
          a|=b;
          System.out.println(a);
          a=15;
          a^=b;
          System.out.println(a);
          a=10;
          a<<=2;
          System.out.println(a);
         a>>=1;
         System.out.println(a);
	}
}