import java.util.regex.*;

public class StartLetter {
    public static void main(String[] args){
        String s = "apple hello Angel a bottle ahah";
        char letter = 'a';
        Pattern pattern = Pattern.compile("\\b["+ Character.toLowerCase(letter) + Character.toUpperCase(letter) + "][a-zA-Z]*\\b");
        Matcher matcher = pattern.matcher(s);
        try{
            while(matcher.find()){
                System.out.println(matcher.group());
            }
        }catch (Exception e){
            System.out.println("Exception " + e);
        }
    }
}
