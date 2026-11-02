import javax.swing.*;
public class StringArrayInput
{
    public static void main(String args[])
    {
       String countries[]=new String[3];
       int i;
       for(i=0;i<countries.length;i++)
       {
          countries[i]=JOptionPane.showInputDialog("enter country name");
       }
      System.out.println("countries are :");
      for(i=0;i<countries.length;i++)
      {
              System.out.println(countries[i]);
       }
    }
}