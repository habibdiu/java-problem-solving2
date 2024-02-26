import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        //Find Armstrong number

        Scanner sc  = new Scanner(System.in);
        int num,temp,rem,sum=0;

        System.out.print("Enter number to see its Armstrong or not: ");
        num = sc.nextInt();

        temp = num;

        while (temp!=0){

            rem = temp%10;
            //sum += (Math.pow(rem,3));
            sum += (rem*rem*rem);
            temp = temp/10;
        }
        if (sum == num){
            System.out.println("Armstrong Number.");
        }
        else
            System.out.println("Not a Armstrong number");
    }
}
