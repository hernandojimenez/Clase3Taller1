package demoRename;

public class PasswordFuerte extends Password{

    public PasswordFuerte() {
        super("^(?=.*\\d)(?=.*[\\u0021-\\u002b\\u003c-\\u0040])(?=.*[A-Z])(?=.*[a-z])\\S{8,16}$");
    }
}
