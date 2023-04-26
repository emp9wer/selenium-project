package day04_concatenation_practices;

public class Replit {
    public static void main(String[] args) {
 String firstName = "Noah",
        lastName = "Smith",
        companyName = "Apple",
        jobTitle = "SDET",
        officeAddress = "One Apple Park Way, Cupertino, CA 95014",
        fullName = firstName + " " + lastName;

    int salary = 200_000,
        startDay = 10,
        startMonth = 1,
        startYear = 2022;

    boolean isFullTime = true;

    String fullStartDate = startMonth + "/" +startDay +"/"+ startYear;
    String email = firstName+startDay+"@"+companyName+".com";
    int salaryAfter2Years = salary + salary/100*15;
        System.out.print("Employee Information\nWe have "+fullName+" joining "+companyName+
                "\n"+firstName+ " will start on "+fullStartDate+" as full time: "+isFullTime+
                "\n"+firstName+ " here is some information about your employment\n"+
                "Your email is "+email+"\nYour base salary is $"+salary+
                " and after 2 years it will be $"+salaryAfter2Years+"\nWelcome aboard, see you at "+officeAddress);




    }
}
