import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Purpose: In order to print duplicate letters in the given string
 * New functions learnt: Map<> and HashMap<>
 * Map<> extends AbstractMap implements HashMap
 */

public class Duplicates {
    public static void printDuplicates(String word){
        char[] characters = word.toCharArray();
        Map<Character,Integer> mapper = new HashMap<Character,Integer>();
        for(Character ch : characters){
            if(mapper.containsKey( ch )){
                mapper.put( ch,mapper.get(ch) +1);
            }else{
                mapper.put(ch,1);
            }
        }
        Set<Map.Entry<Character,Integer>> entrySet = mapper.entrySet();
        System.out.printf("Duplicates Letter in the word '%s' %n" , word);
        for(Map.Entry<Character,Integer> entry: entrySet){
            if(entry.getValue() > 1 ){
                System.out.printf("%s:%d %n" , entry.getKey() ,entry.getValue());
            }
        }
    }

    /**
     * In the below program the strings have duplicates and output will be the number of times the duplicate letters are repeated
     * @param main
     */
    public static void main(String[] main){
        printDuplicates( "Programming" );
        printDuplicates( "Jarvis" );
        printDuplicates( "Java" );
        printDuplicates( "Combination" );
    }
}
