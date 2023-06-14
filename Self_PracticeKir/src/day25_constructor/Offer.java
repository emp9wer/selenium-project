package src.day25_constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class Offer {
    //Create a class named MyOffers:
public double salary;
public String companyName;
public boolean isFullTime;
public boolean areBenefits;
public boolean isPto;
public String location;
public String jobTitle;

    public Offer(double salary, String companyName, boolean isFullTime, boolean areBenefits, boolean isPto, String location, String jobTitle) {
        this.salary = salary;
        this.companyName = companyName;
        this.isFullTime = isFullTime;
        this.areBenefits = areBenefits;
        this.isPto = isPto;
        this.location = location;
        this.jobTitle = jobTitle;
    }

    public String toString() {
        return "myOffers{" +
                "salary=" + salary +
                ", companyName='" + companyName + '\'' +
                ", isFullTime=" + isFullTime +
                ", areBenefits=" + areBenefits +
                ", isPto=" + isPto +
                ", location='" + location + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }

    public static void main(String[] args) {

        System.out.println(" //\n//2.1 Create 7 objects of Offer\n");


        Offer o1 = new Offer(120000,"Google",true,false,true,"Dallas","Java Developer");
        Offer o2 = new Offer(95000,"Alibaba",false,false,false,"Boston","SDET");
        Offer o3 = new Offer(80000,"Adobe",true,true,true,"Los Angeles","Ruby developer");
        Offer o4 = new Offer(170000,"PNC",true,true,true,"Pittsburgh","SDET");
        Offer o5 = new Offer(110000,"Bing",true,false,false,"","Python Developer");
        Offer o6 = new Offer(99000,"Google",true,false,false,"Pittsburgh","Java Developer");
        Offer o7 = new Offer(120000,"Tesla",true,false,false,"Hollywood","Manual Qa");


        System.out.println("//\n//2.2 Create an array of Offers named Offer and store all 7 objects of offers\n");
        Offer[] offers = {o1,o2,o3,o4,o5,o6,o7};


        System.out.println("//\n//2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.\n");
        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(offers));
        System.out.println(fullTimeOffers);

        System.out.println();
        System.out.println();

        fullTimeOffers.removeIf(p-> !p.isFullTime);
        System.out.println(fullTimeOffers);

        System.out.println("//\n//2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.\n");

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(offers));

        System.out.println("//\n//2.4.1 Write a program that can remove all the offers that are not from local\n");

        localOffers.removeIf(p -> !p.location.equalsIgnoreCase("Pittsburgh") );
        System.out.println(localOffers);


        System.out.println(" //\n//2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.\n");

        ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(offers));

        System.out.println("//\n//2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO\n");

        offersWithBenefits.removeIf(p -> (!p.areBenefits && !p.isPto));
        System.out.println(offersWithBenefits);

        System.out.println("\n 2.6 Create an ArrayList of Offer named devOffers and add all the offer objects.\n");

        ArrayList<Offer> devOffers = new ArrayList<>(Arrays.asList(offers));

        System.out.println("\n 2.6.1 Write a program that can remove all the offers that does not contain developer in the jobTitle\n");

        devOffers.removeIf(p -> !p.jobTitle.toLowerCase().contains("developer"));
        System.out.println(devOffers);

        System.out.println("\n2.7 Create an ArrayList of Offer named offers With100K and add all the offer objects.\n");

        ArrayList<Offer> offersWith100k = new ArrayList<>(Arrays.asList(offers));

        System.out.println("\n2.7.1 Write a program that can remove all the offers that are offering less than 100K salary\n");

        offersWith100k.removeIf(p-> p.salary<100000);
        System.out.println(offersWith100k);

    }













}
