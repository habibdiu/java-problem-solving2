import java.util.Scanner;

public class FindPalindromeNumbers {

    public static void main(String[] args){


        //find Palindrome number

        int num,rem, temp,sum=0;
        Scanner sc = new Scanner(System.in);



        System.out.print("Enter numbers to validate palindrome: ");
        num = sc.nextInt();

        temp =num;

        while (temp!=0){

            rem = temp%10;
            sum = sum*10+rem;
            temp = temp/10;
        }
        if (sum == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome !");

    }
}
