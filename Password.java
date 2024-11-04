import java.util.regex.*;

public class Password {
    public static void main(String[] main){
        String pass = "Helloworld1";
        Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,16}$");
        Matcher matcher = pattern.matcher(pass);

        try{
            if(pass.equals("")){
                System.out.println("Строка пароль должна быть заполнена");
            }
            else if(matcher.matches()){
                System.out.println("Пароль введен коректно");
            }else{
                System.out.println("Нарушение правил ввода пароля");
            }
        }catch (Exception e){
            System.out.println("Exception" + e);
        }


    }
}
