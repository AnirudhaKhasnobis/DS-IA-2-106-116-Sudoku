import java.util.*;

public class ComplexNumbers

{
    public static void main(String[] args)

    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the real part of your complex number1: ");
        double real1=sc.nextDouble();
        System.out.println("Enter the imaginary part of your complex number1: ");
        double imaginary1=sc.nextDouble();
        
        System.out.println("Enter the real part of your complex number2: ");
        double real2=sc.nextDouble();
        System.out.println("Enter the imaginary part of your complex number2: ");
        double imaginary2=sc.nextDouble();


        double sumreal=real1+real2;
        double sumimaginary=imaginary1+imaginary2;

        System.out.println("The sum of your 2 complex numbers is : " + sumreal + "+ i" + sumimaginary );
    }


}