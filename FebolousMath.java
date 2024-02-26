import java.util.Scanner;

public class FebolousMath {

    public static void main(String[] args) {


        //Fibonacci series

        int nNumb,firstNumb, secondNumb, fibonacci;

        Scanner sc = new Scanner(System.in);

        System.out.println("Fibonacci series till: ");
        nNumb = sc.nextInt();
        firstNumb = 0;
        secondNumb =1;

        System.out.print("\n"+firstNumb+" "+secondNumb);
        for (int i=3;i<=nNumb;i++){

            fibonacci = firstNumb+secondNumb;
            System.out.print(" "+fibonacci+" ");

            firstNumb = secondNumb;
            secondNumb = fibonacci;
        }

        //Fibonacci series in between
        int startingF,secondPosition, endingF, userDefinedFibo,j;
        System.out.println();

        System.out.print("starting of fibonacci: ");
        startingF = sc.nextInt();


        System.out.print("\nEnding Fibonacci: ");
        endingF = sc.nextInt();

        secondPosition = startingF;
        System.out.print("\n"+startingF+" "+secondPosition+" ");

        for (j=startingF;j<=endingF;j++){

            userDefinedFibo = startingF+secondNumb;
            System.out.print(" "+userDefinedFibo);
            startingF = secondNumb;
            secondNumb = userDefinedFibo;
        }

    }
}
