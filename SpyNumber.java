import java.util.Scanner;
class SpyNumber
{
    public static void main(String[]args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = s.nextInt();
        int sum = 0;
        int product = 1;

        while(num>0)
        {
            int rem = num % 10 ;
            sum = sum + rem ;
            product = product * rem ; 
            num = num/10;
        }
        if(sum == product)
        {
            System.out.println("It is a SPY Number");
        }
        else
        {
            System.out.println("It is NOT a SPY Number");

        }
    }
}