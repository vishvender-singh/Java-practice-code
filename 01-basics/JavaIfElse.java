import javax.swing.*;
public class JavaIfElse
{
 		public static void main(String args[])
			{
				int num;
                                num=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				if(num%2==0 && num<99 && num<1000)
				{ 
                                  System.out.println("3 digit even number ");
				}
				else
				{ 
                                  System.out.println("Not a 3 digit even number ");
				}
	
			}
}