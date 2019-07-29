import java.util.Scanner;

/**
 * purpose: to give sum of two numbers
 */
public class Twosum {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstnumber = 0;
        int secondnumber = 0;
        int sum;
        System.out.println("Enter First Number :");
        firstnumber = scanner.nextInt();
        System.out.println("Enter Second Number : ");
        secondnumber = scanner.nextInt();
        sum = firstnumber + secondnumber;
        System.out.println(" the sum of two numbers : " + sum);


    }

}
