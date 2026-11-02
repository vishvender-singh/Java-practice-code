import javax.swing.*;
class Book
{
   private String title;
   private String author;
  
  public void accept()
  {
      title=JOptionPane.showInputDialog("enter a title");
      author=JOptionPane.showInputDialog("enter author name");

   }
    public void display()
     {
           System.out.println("Name of book is :"+ title);
           System.out.println("Author is :" + author);
     }
}
public class BookSwingInput
{
   public static void main(String args[])
    {
    Book A;
    A=new Book();
    A.accept();
   System.out.println("data in a is :");
   A.display();
   }
}