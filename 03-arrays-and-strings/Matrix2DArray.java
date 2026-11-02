import javax.swing.*;
public class Matrix2DArray
{
   public static void main(String args[])
   {
      int q[][]=new int[3][4];
      int row,col;
      for(row=0;row<3;row++)
      {
         for(col=0;col<4;col++)
         {
           q[row][col]=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
         }
      }
     for(row=0;row<3;row++)
      {
         for(col=0;col<4;col++)
         {
           System.out.print(q[row][col]+"\t");         
      }
       System.out.println();
      }
   }
}