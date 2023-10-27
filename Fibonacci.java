import java.util.Scanner;

public class Fibonacci

{
    /**
     * @param args
     */
    public static void main(String[] args)
    
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the number of digits you want your fibonacci series to be:");
        int num=sc.nextInt();

        if (num<0)
        {
           System.out.println("Invalid Input");
        }

        else
        {

            System.out.println("Your fibonacci series:");

            int a=0;
            int b=1;
            int c=0;
            for(int i=0;i<=num;i++)
            {
              
              System.out.println(a);
              c=a+b;
              a=b;
              b=c;

            }
        }
    }
}