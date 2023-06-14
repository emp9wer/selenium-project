package src.day33_abstraction;

import src.day32_finalKeyword.person.Person;

import java.time.LocalDate;

public final class CydeoDevStudent extends Person {

    private final String id;
    private String batchName;
    private int batchNumber;
    public static final String programmingLanguage;

    public CydeoDevStudent(String name, char gender, LocalDate dateOfBirth, String id, String batchName, int batchNumber) {

        super(name, gender, dateOfBirth);
        if(getAge()<18){
            System.err.println("must be at least 18");
            System.exit(1);
        }
        this.id = id;
       setBatchName(batchName);
        setBatchNumber(batchNumber);
    }

   static  {
       programmingLanguage = "Java";
    }

    public String getId() {
        return id;
    }

    public String getBatchName() {
        return batchName;
    }

    public int getBatchNumber() {
        return batchNumber;
    }

    public void setBatchName(String batchName) {
        if (batchName.equalsIgnoreCase("zero to hero") || batchName.equalsIgnoreCase("alumni developer")) {
            this.batchName = batchName;
        }else {
            System.err.println("invalid batch name");
            System.exit(1);
        }

    }
    public void setBatchNumber(int batchNumber) {
        if(batchNumber<=0){
            System.err.println("invalid batch number");
            System.exit(1);
        }
        this.batchNumber = batchNumber;
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating "+programmingLanguage);
    }


    @Override
    public String toString() {
        return super.toString() +" ----name of batch: "+ batchName+" ----number of batch: "+batchNumber;

    }
}
