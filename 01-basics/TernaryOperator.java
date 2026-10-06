import javax.swing.*;
public class TernaryOperator
{
        public static void main(String args[])
        {
                    int a,b,max;
                    a=Integer.parseInt(JOptionPane.showInputDialog("enter a value for A"));
                    b=Integer.parseInt(JOptionPane.showInputDialog("enter a value for b"));
                    max=a>b?a:b;
                    JOptionPane.showInputDialog(null,"maximum is : "+ max); 

        }
}