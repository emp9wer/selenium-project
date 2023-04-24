package Self_PracticeKir.day31_methodOverriding.browserTask;

public class Runner {

    public static void main(String[] args) {

        ChromeBrowser chrome = new ChromeBrowser();
        chrome.openBrowser();
        chrome.closeBrowser();

        System.out.println("-------method override-------");

        FireFox fireFox = new FireFox();
        fireFox.openBrowser();
        fireFox.closeBrowser();
    }
}
