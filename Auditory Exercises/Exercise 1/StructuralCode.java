import java.util.Scanner;

public class StructuralCode
{
    //Count all the numbers between a and b, which are divisible with the sum of their digits
    public static int function(int a, int b)
    {
        int counter=0; //save the digit count
        for (int i=a; i<=b; i++)
        {
            int temp = i; //save the number to calculate the sum of digits
            int sum = 0; //save the sum of the digits;

            //Calculate the sum of digits in the number
            while(temp > 0)
            {
                sum+=(temp%10);
                temp/=10;
            }
            if (i % sum == 0)
                counter++;
        }
        return counter;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter starting number: ");
        int x = scanner.nextInt();
        System.out.println("Enter ending number: ");
        int y = scanner.nextInt();

        System.out.println(function(x, y));

    }
}
