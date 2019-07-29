import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicates {
    public static int[] duplicates(int[] Arrayofduplicates){
        Arrays.sort(Arrayofduplicates);
        int[] result = new int[Arrayofduplicates.length];
        int previous = Arrayofduplicates[0];
        result[0] = previous;
        for(int i=0;i< Arrayofduplicates.length;i++){
            int ch = Arrayofduplicates[i];
            if(previous != ch){
                result[i] = ch;
            }
            previous = ch;
        }
        return result;
    }

    public static void main(String[] args){
        int[][] test = new int[][]{
                {1,1,2,3,4,5,5},
                {1,1,1,1,1,1,1},
                {1,2,3,7,8,5,6},
                {1,2,1,1,1,1,1}};
        for(int[] input: test){
            System.out.println("Array with Duplicates : " + Arrays.toString(input) );
            System.out.println("Array without Duplicates : " + Arrays.toString( duplicates(input)));
        }
    }
}
