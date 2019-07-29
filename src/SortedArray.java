import java.util.Arrays;

/**
 * Purpose: merges two arrays and sorts the final array
 */
class SortedArray {
    public static void sortarray(int arrayone[], int arraytwo[], int sorted[], int m, int n) {
        int i = 0, j = 0, k = 0;
        while (i < n) {
            sorted[k] = arrayone[i];
            i++;
            k++;
        }
        while (j < m) {
            sorted[k] = arraytwo[j];
            j++;
            k++;
        }
        Arrays.sort( sorted );
    }

    public static void main(String[] args) {
        int arrayone[] = {3,5,8,1,90,23,7};
        int arraytwo[] = {100, 86, 35, 89, 2, 10};
        int n = arrayone.length;
        int m = arraytwo.length;
        int sorted[] = new int[n + m];
        sortarray( arrayone, arraytwo, sorted, m, n );

        System.out.print( "Sorted merged list :" );
        for (int i = 0; i < n + m; i++)
            System.out.print( " " + sorted[i] );

    }


}
