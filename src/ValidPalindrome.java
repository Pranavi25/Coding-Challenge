import java.sql.SQLOutput;

public class ValidPalindrome {
    /**
     * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
     * purpose of this problem, we define empty string as valid palindrome.
     */

    public static void main(String[] args){
        System.out.println("Is MoM a Palindrome ?" + " " +ispalindrome( "MoM" ));
        System.out.println( "Is Meet a Palindrome ?" + " " + ispalindrome( "Meet" ));
    }
    public static boolean ispalindrome(String word){
        String reverse = reverse(word);
        if(word.equals( reverse )){
            return true;
        }
        return false;
    }

    private static String reverse(String input) {
        if(input == null || input.isEmpty()){
            return input;
        }
        return input.charAt( input.length() -1 ) + reverse( input.substring( 0,input.length() -1 ) );
    }

}
