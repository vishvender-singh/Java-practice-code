import javax.swing.*;
public class jaggedArrayDemo
{
     public static void main (String args[])
     {
       int row,col;
       int q[][]=new int[3][];
       q[0]=new int[5];
       q[1]=new int[4];
       q[2]=new int[6];
       for(row=0;row<q.length;row++)
       {
           for(col=0;col<q[row].length;col++)
           {
             q[row][col]=Integer.parseInt(JOptionPane.showInputDialog("enter a number"));
           }
        }
       System.out.println("data in q is :");
       for(row=0;row<q.length;row++)
       {
           for(col=0;col<q[row].length;col++)
           {
             System.out.print(q[row][col] + "\t");
           }
          System.out.println();
        }

     }
}