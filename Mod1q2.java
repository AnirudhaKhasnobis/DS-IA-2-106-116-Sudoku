import java.util.Scanner;

public class Mod1q2

{
    public static void main(String[] args)
    
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n=sc.nextInt();

        int sum=0;

        for(int i=0;i<=n;i++)

        {
            if(i%3==0)
            {
                sum=sum+1;
            }

        }

        System.out.println("The number of numbers divisible by 3 between 0 and " + n + " is:  " + sum);


    }
}