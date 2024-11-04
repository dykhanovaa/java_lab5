import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {
        String text = "The price of t3he product is $19.99 or is it $25?";
        Pattern pattern = Pattern.compile("\\d+(.\\d+)?");
        Matcher matcher = pattern.matcher(text);
        try{
            while (matcher.find()) {
                System.out.println(matcher.group());
            }
        }catch(Exception e){
            System.out.println("Произошла какая-то ощибка:" + e);
        }

    }
}
