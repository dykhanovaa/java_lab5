import java.util.regex.*;

public class IPAdress {
    public static void main(String[] args){
        String adr = "25.54.123.255";
        Pattern pattern = Pattern.compile("^((25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d).){3}(25[0-5]|2[0-4]\\d|1\\d{2}|[1-9]?\\d)$");
        Matcher matcher = pattern.matcher(adr);
        try{
            if(matcher.matches()){
                System.out.println("IP address is correct");
            }else{
                System.out.println("IP address is not correct");
            }
        }catch (Exception e){
            System.out.println("Exception " + e);
        }

    }
}
