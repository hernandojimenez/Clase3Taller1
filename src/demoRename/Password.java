package demoRename;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Password {

    private Pattern pattern;
    private Matcher matcher;
    private String password;

    public Password(String pattern){
        this.pattern = Pattern.compile(pattern);
    }
    public void setValues(String pass){
        this.matcher = pattern.matcher(pass);

        if(matcher.find()){
            System.out.println("La contraseña correcta");
        }else{
            throw new RuntimeException("La contraseña no cumple con las condiciones establecidad");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
