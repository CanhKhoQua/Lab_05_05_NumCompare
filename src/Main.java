import java.util.InputMismatchException;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

            System.out.println("Enter your two numbers ");
            try
                {
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    if (num1==num2)
                    {
                        System.out.println(num1 + " and " + num2 + " are equal");
                    }
                    else if (num1 > num2)
                    {
                        System.out.println(num2 + " is less than " + num1);
                    }
                    else if (num1 < num2)
                    {
                        System.out.println(num1 + " is less than " + num2);
                    }
                }
                catch(InputMismatchException e)
                {
                    System.out.println("Your input is not a number. Please try again");
                }
            }


        }