import javax.swing.*;
public class IfLadder
{               public static void main(String args[])
		{
                                int num;
                                num=Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
				if(num%3==0 && num%5==0)
				{ 
                                  System.out.println("completely divisible by 3 and 5  ");
				}
                                else if(num%3==0||num%5==0)
				{ 
                                  System.out.println("either divisble by 3 or 5 ");
				}

				else
				{ 
                                  System.out.println("Not divisible by 3 and 5 ");
				}

                                      
		}
}