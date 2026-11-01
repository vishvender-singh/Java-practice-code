class Country
{
    String name;
    String capital;
    
}
public class CountryObjectDemo
{
     public static void main(String args[])
     {
	Country Q;
        Q=new Country();
        Q.name="India";
        Q.capital="New Delhi";
        Country N=new Country();
        N.name="France";
        N.capital="Paris";
        System.out.println("data in Q is");
        System.out.println("Country is :"+ Q.name);
        System.out.println("Capital is :"+ Q.capital);
        System.out.println("data in N is");
        System.out.println("Country is :"+ N.name);
        System.out.println("Capital is :"+ N.capital);

     }
}