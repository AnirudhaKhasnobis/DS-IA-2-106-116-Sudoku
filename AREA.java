import java.util.*;
import java.lang.Math;

public class AREA 
{
    public static void main(String[] args)

    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius=sc.nextDouble();
        System.out.println("The area of the circle is:"+  radius * radius  * Math.PI );
        System.out.println("The cicumference of the circle is:" +  Math.PI *  2 * radius );       

    }
}
