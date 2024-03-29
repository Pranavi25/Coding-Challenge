/**
 * Purpose: to return the missing number(s) from the given array
 */
public class MissingNumber {
    public static int  missingnumber(int arr[]){
        int n = arr.length+1 ;
        int sum = n*(n+1)/2;
        int RestSum = 0;
        for(int i=0;i<arr.length;i++){
            RestSum += arr[i];
        }
        int missingnumber = (sum - RestSum);
        return missingnumber;
    }

    public static void main(String[] args){
        int[] arr1 = {7,5,6,1,4,2};
        int[] arr2 = {5,3,2,1};
        System.out.println(missingnumber( arr1 ));
        System.out.println(missingnumber( arr2 ));
    }
}
