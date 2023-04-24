package Self_PracticeKir.day08_TernariesAndSwitch;

public class Selectedbrowser_09 {
    public static void main(String[] args) {
        String browserName = "fafafafa";    // valid are chrome, firefox, opera, safari, edge

        switch (browserName) {
            case "chrome":
                browserName = "chrome";
                break;
            case "firefox":
                browserName = "firefox";
                break;
            case "opera":
                browserName = "opera";
                break;
            case "safari":
                browserName = "safari";
                break;
            case "edge":
                browserName = "edge";
                break;
            default:
                browserName = "Invalid Browser";
                break;

        }
        System.out.println(browserName);
    }
}

/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */