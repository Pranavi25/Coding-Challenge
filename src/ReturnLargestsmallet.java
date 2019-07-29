import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnLargestsmallet {
    public static void largest_smallest(int[] numbers){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int number: numbers){
            if(number > largest){
                largest = number;
            }else if(number < smallest){
                smallest = number;
            }
        }
        System.out.println("Given integer Array:" + Arrays.toString(numbers));
        System.out.println("Largest number in the Array : " + largest);
        System.out.println("Smallest number in the Array : " + smallest);
    }
    public static void main(String[] args){
        largest_smallest(new int[]{5,10,-10,5,300,Integer.MAX_VALUE} );
        largest_smallest( new int[] {10,Integer.MIN_VALUE,-10} );
        largest_smallest( new int[] {40,7,0} );
    }
}
