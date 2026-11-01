class Book
{
   private String title;
   private String author;
   private int price;

        public void setTitle(String ti)
	{
             title=ti;
	}
        public void setAuthor(String au)
	{
             author=au;
	}
        public void setPrice(int pr)
	{
             price=pr;
	}
       public void display()
	{
          System.out.println("Book is "+title);
          System.out.println("Author name is "+ author);
          System.out.println("price of book is" +price);


	}

        
}
 
public class BookEncapsulation
{
	public static void main(String args[])
	{
           Book Q=new Book();
           Q.setTitle("the hunt of atlantis");
           Q.setAuthor("Andy MC Dermott");
           Q.setPrice(500);
           System.out.println("data in q is");
           Q.display();
	}
}