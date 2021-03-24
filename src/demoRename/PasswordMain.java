package demoRename;

public class PasswordMain {
    public static void main(String[] args) {
        Password p = new PasswordSimple();
        p.setPassword("Camila16");
        p.setValues(p.getPassword());
    }
}
