package Self_PracticeKir.day31_methodOverriding.browserTask;

public class FireFox extends Browser {
    @Override
    public void openBrowser() {
        System.out.println("opening firefox browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing fire fox browser");
    }
}
