import java.util.Scanner;
public class Factorial
{
    public static void Main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num=sc.nextInt();
        
        for(int i=1; i<=num; i++)
        {
            factorial = factorial* i;
        }
        System.out.println("Factorial is "+ num);
    }
}