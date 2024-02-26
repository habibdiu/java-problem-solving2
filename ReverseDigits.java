import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args){

        //Reverse all digits
        int num,temp, sum=0,rem;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any numbers to see its revers: ");
        num = sc.nextInt();

        temp= num;

        System.out.println();
        while (temp!=0){

            rem = temp%10;
            sum = (sum*10)+rem;
            temp = temp/10;

        }
        System.out.println(sum);
    }
}
