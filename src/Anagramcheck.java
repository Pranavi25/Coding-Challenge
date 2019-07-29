import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * This program finds if two words are anagrams or not
 * there are two ways to implement this logic
 */

public class Anagramcheck {
    public static boolean isanagram(String word, String anagram){
        if(word.length() != anagram.length()){
            return false;
        }
        char[] chars = word.toCharArray();
        for(char c: chars){
            int index = anagram.indexOf(c);
            if(index != -1){
                anagram = anagram.substring( 0,index ) + anagram.substring( index + 1, anagram.length() );
            } else{
                return false;
            }
        }
        return anagram.isEmpty();
    }

    public static boolean compareanagram(String word, String anagram){
        char[] chars = word.toCharArray();
        char[] chars1 = anagram.toCharArray();
        Arrays.sort(chars);
        Arrays.sort(chars1);
        return Arrays.equals( chars,chars1 );
    }

    public static void main(String[] args){
        System.out.println(isanagram( "Anagram","nagAram" ));
        System.out.println(isanagram( "Race", "caR" ));
        System.out.println(isanagram( "city", " ticy" ));
        System.out.println(compareanagram( "Anagram", "nagAram" ));
        System.out.println(compareanagram( "race","car" ));
        System.out.println(compareanagram( "city","ticy" ));
    }
}
