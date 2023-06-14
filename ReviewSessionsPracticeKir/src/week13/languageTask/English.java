package week13.languageTask;

public class English implements Language{

    @Override
    public void hello() {
        System.out.println("hello");
    }

    @Override
    public void bye() {
        System.out.println("bye");
    }
}
