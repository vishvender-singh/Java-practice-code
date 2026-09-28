import java.util.*;
public class BasicOperation
{
             public static void main(String args[])
              {
                       int a=10,b=20;
                        System.out.println("addition is : " + (a+b));
                        System.out.println("subtraction is :" + (a-b));
                        System.out.println("remender is :" + (a%b));
                        Scanner Q= new Scanner(System.in);
                        int r;
                        float area;
                        System.out.print("enter the radius");
                        r=Q.nextInt();
                        area=3.14f*r*r;
                        System.out.println("area is : "+ area);
                        int x,y,z,avg;
                        System.out.println("enter 3 number ");
                        x=Q.nextInt();
                        y=Q.nextInt();
                        z=Q.nextInt();
                        avg=(x+y+z)/3;
                        System.out.println("average is " + avg);
                        int ans;
                        ans=(y*y)-4*(x*y);
                        System.out.println("equation answer is : "+ ans);    
	      }
}