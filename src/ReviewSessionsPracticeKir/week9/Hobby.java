package ReviewSessionsPracticeKir.week9;

public class Hobby {
    //creating instance variables

    String name;
    double annualCost;
    boolean isOutdoors;
    boolean requiresOthers;

    //constructor with name

    public Hobby(String name) {
        this.name = name;
    }

    //constructor with name annualCost;

    public Hobby(String name, double annualCost) {
        this(name);
        this.annualCost = annualCost;
    }

    //constructor with name annualCost; isOutdoors; requiresOthers;

    public Hobby(String name, double annualCost, boolean isOutdoors, boolean requiresOthers) {
      this(name, annualCost);
        this.isOutdoors = isOutdoors;
        this.requiresOthers = requiresOthers;
    }

    public void doIt(){
        System.out.println("doing "+name+(isOutdoors? " outside" : " inside"));
    }

    public String toString() {
        return "Hobby{" +
                "name='" + name + '\'' +
                ", annualCost=" + annualCost +
                ", isOutdoors=" + isOutdoors +
                ", requiresOthers=" + requiresOthers +
                '}';
    }
}
