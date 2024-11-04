import java.util.regex.*;

public class CapitalLetter {
    public static void main(String[] args){
        String s = "helLo wOrlD";
        Pattern pattern = Pattern.compile("[a-z][A-Z]");
        Matcher matcher = pattern.matcher(s);

        StringBuffer result = new StringBuffer();
        while(matcher.find()){
            matcher.appendReplacement(result, "!"+matcher.group()+"!");
        }
        System.out.println(result);
    }
}
