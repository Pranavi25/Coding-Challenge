import java.util.regex.Pattern;

/**
 * Purpose: to say if given pattern is a number or digits
 */
public class CheckStringadigit {
    public static void main(String[] args){
        Pattern pattern = Pattern.compile(".*[^0-9].*");
        String[] inputs = {"123","av340","67889","5gkdj"};
        for(String input: inputs){
            System.out.println("Is " + input + " a digit ? " + !pattern.matcher( input ).matches());
        }

    }
}
