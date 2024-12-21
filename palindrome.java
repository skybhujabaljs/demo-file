import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		//input and variable declaration part
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int rev = 0;
        int a=n;

        //looping part
        while (n>0)
        {
            rev = ((rev*10) + (n%10));
            n = n/10;
        }
        
        //palindrome check part
        System.out.println("Your entred number is: " + a);
        System.out.println("Reverse of your number is: " + rev);

        if (a==rev)
        {
            System.out.println("Congo!!! The number is a palindrome.");
        }
        else
        {
            System.out.println("Oops!!! The number is not a palindrome");
        }
        sc.close();

    }





	}