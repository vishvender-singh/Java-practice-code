import javax.swing.*;
public class ArrayUserInput
{
   public static void main(String args[])
   {
        int q[]=new int[5];
        int i;
        for(i=0;i<q.length;i++)
        {
           q[i]=Integer.parseInt(JOptionPane.showInputDialog("enter an intger"));
        
        }
        System.out.println("data in q is :");
       for(i=0;i<q.length;i++)
       {
          System.out.println(q[i]);
       }
    }
}