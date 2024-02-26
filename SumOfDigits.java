import javax.print.attribute.standard.MediaSize;
import java.util.Scanner;
import java.util.Spliterator;

public class SumOfDigits {

    public static void main(String[] args) {

        //Sum of all in between 3 digits

        int userDigits,sumFor3Digit,i,firstDigit,temp,secondDigit,thirdDigit,
            fourthDigit,sumFor4Digit,tem,fifthDigit,sumFor5Digit,sumFor2Digit,
            sixthDigit,sumFor6Digit,seventhDigit,sumFor7Digit;

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter any number(in between 9999999): ");
        userDigits = sc.nextInt();


        if (userDigits<=9){
            System.out.println("Wrong! Value should be in between(10-999999)");
        }
        else if (userDigits>=10000000){
            System.out.println("Wrong! Value should be in between(10-999999)");
        }
        else if (userDigits>999999){
            firstDigit = userDigits/1000000;//7987654/1000000=7
            temp = userDigits%1000000;//7987654%1000000=987654
            secondDigit = temp/100000;//987654/10000=9
            temp = temp%100000;//987654%10000=87654
            thirdDigit = temp /10000; //87654/10000=8
            temp = temp%10000;//87654%10000=7654
            fourthDigit = temp/1000;//7654/1000=7
            temp = temp%1000;//7654%1000=654
            fifthDigit = temp/100;//654/100=6
            temp = temp%100;//654%100=54
            sixthDigit = temp/10;//54/10=5
            seventhDigit = sixthDigit%10;//54%10=4

            sumFor7Digit = (firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit+sixthDigit+seventhDigit);
            System.out.println("Digits are: "+firstDigit+"+"+secondDigit+"+"+thirdDigit+"+"+fourthDigit+"+"+fifthDigit+"+"+sixthDigit+"+"+seventhDigit+" = "+sumFor7Digit);
        }

        else if (userDigits>99999){

            firstDigit = userDigits/100000;
            temp = userDigits%100000;
            secondDigit = temp/10000;
            temp = temp%10000;
            thirdDigit = temp/1000; //ok
            temp = temp%1000;
            fourthDigit = temp/100;
            temp = temp%100;
            fifthDigit = temp/10;
            sixthDigit = fifthDigit%10;

            sumFor6Digit = firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit+sixthDigit;
            System.out.println("Digits are: "+firstDigit+"+"+secondDigit+"+"+thirdDigit+"+"+fourthDigit+"+"+fifthDigit+"+"+sixthDigit+" = "+sumFor6Digit);
        }

        else if (userDigits>9999) {

            firstDigit = userDigits/10000;
            temp = userDigits%10000;
            secondDigit = temp/1000;
            temp = temp%1000;
            thirdDigit = temp/100;
            tem = temp%100;
            fourthDigit = tem/10;
            fifthDigit = fourthDigit%10;

            sumFor5Digit = firstDigit+secondDigit+thirdDigit+fourthDigit+fifthDigit;

            System.out.println("Digits are: "+firstDigit+"+"+secondDigit+"+"+thirdDigit+"+"+fourthDigit+"+"+fifthDigit+" = "+sumFor5Digit);

        }
        else if (userDigits>999) {

            firstDigit = userDigits/1000;//ok
            temp = userDigits%1000;//ok
            secondDigit = temp/100;//ok
            temp = temp%100;//ok
            thirdDigit = temp/10;//ok
            fourthDigit = thirdDigit%10;

            sumFor4Digit = firstDigit+secondDigit+thirdDigit+fourthDigit;
            System.out.println("Digits are: "+firstDigit+"+"+secondDigit+"+"+thirdDigit+"+"+fourthDigit+" = "+sumFor4Digit);
        }
        else if (userDigits>99){

            firstDigit = userDigits/100;
            temp = userDigits%100;
            secondDigit =  temp/10;
            thirdDigit = temp%10;

            sumFor3Digit = firstDigit+secondDigit+ thirdDigit;

            System.out.println("Digits are: "+firstDigit+"+"+secondDigit+"+"+thirdDigit+" = "+sumFor3Digit);
        }

        else if (userDigits>9) {

            firstDigit = userDigits/10;
            secondDigit = userDigits%10;

            sumFor2Digit = firstDigit+secondDigit;

            System.out.println("Digits are: "+firstDigit+"+"+secondDigit+" = "+sumFor2Digit);
        }


        /*////Adding individual digit using loop
        Scanner input = new Scanner(System.in);

        long temp, reminder,userNumb,sum=0;

        System.out.println("Enter any digit to see individuals sum: ");
        userNumb = input.nextLong();

        temp=userNumb;

        while (temp!=0){
            reminder = temp%10;
            sum+=reminder;
            temp = temp/10;
        }

        System.out.println("Sum: "+sum);*/

    }
}
