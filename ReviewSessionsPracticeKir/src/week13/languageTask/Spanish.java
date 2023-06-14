package week13.languageTask;

public class Spanish implements Language{
    @Override
    public void hello() {
        System.out.println("hola");
    }

    @Override
    public void bye() {
        System.out.println("adios");
    }
}
