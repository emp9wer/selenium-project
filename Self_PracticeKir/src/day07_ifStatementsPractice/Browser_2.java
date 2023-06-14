package src.day07_ifStatementsPractice;

public class Browser_2 {
    public static void main(String[] args) {
        String browserName = "Edge"; //valid browsers are: Chrome, Firefox, Opera, Safari, Edge.
        String result = " Browser is selected";

        if(browserName == "Chrome" || browserName == "chrome" || browserName == "Firefox" || browserName == "firefox" || browserName == "Opera" || browserName == "opera" || browserName == "Safari" || browserName == "safari"
                || browserName == "Edge" || browserName == "edge"){

            if ( browserName == "Chrome" || browserName == "chrome" ){
                    browserName = "Chrome";
            } else if ( browserName == "Firefox" || browserName == "firefox") {
                    browserName = "Firefox";
            } else if ( browserName == "Opera" || browserName == "opera" ) {
                    browserName = "Opera";
            } else if (browserName == "Safari" || browserName == "safari") {
                    browserName = "Safari";
            } else {
                    browserName = "Edge";
            }
                result = browserName + result;
                System.out.println(result);

        }else {
            System.out.println("Invalid Browser Name");
        }



    }
}
/*
2. Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name

        Ex:
            String browser = "chrome";

        Output:
            Chrome Browser is selected

        Note: MUST use nested if
 */