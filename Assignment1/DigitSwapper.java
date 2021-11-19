package Assignment1;

import java.util.Scanner;

public class DigitSwapper
{
    public static void main(String[] args)
    {
        int firstPos, secondPos, temp, rev=0, digits=0, i;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = s.nextInt();

        for(temp=num; temp>0; temp /= 10)
            digits++;
        int[] arr = new int[digits];

        if(digits==1)
            System.out.println("\nInterchange not possible!");
        else if(digits==2)
            System.out.println("\nInterchange with digit-wise is not possible!");
        else
        {
            System.out.print("\nInterchange the Digit at Position: ");
            firstPos = s.nextInt();
            System.out.print("With Digit at Position: ");
            secondPos = s.nextInt();

            if(firstPos>digits || secondPos>digits)
                System.out.println("\nInvalid Position!");
            else
            {
                for(temp=num; temp>0; temp /= 10)
                    rev = (rev*10) + (temp%10);
                for(i=0; i<digits; i++, rev /= 10)
                    arr[i] = rev%10;
                temp = arr[firstPos-1];
                arr[firstPos-1] = arr[secondPos-1];
                arr[secondPos-1] = temp;
                System.out.println("\nSpecified Digits Interchanged!");
                System.out.print("\nThe new number = ");
                for(i=0; i<digits; i++)
                    System.out.print(arr[i]);
            }
        }
    }
}