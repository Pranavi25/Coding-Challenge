import java.util.Scanner;

/**
 * purpose: to say if the given number is odd or even
 */
public class OddorEven {
    public static void main(String args[]) {
        int num;
        Scanner scan = new Scanner( System.in );

        System.out.print( "Enter a Number : " );
        num = scan.nextInt();

        if (num % 2 == 0) {
            System.out.print( "This is an Even Number" );
        } else {
            System.out.print( "This is an Odd Number" );
        }
    }
}
