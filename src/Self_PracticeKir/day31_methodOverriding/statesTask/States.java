package Self_PracticeKir.day31_methodOverriding.statesTask;

public class States {
    private String name, abbreviation, politicalParty, governor, senator;
    private int population;
    private double stateTax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.isBlank()||name.isEmpty()||name.equalsIgnoreCase("null")){
            System.err.println("wrong name");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if(abbreviation.isBlank()||abbreviation.isEmpty()||abbreviation.equalsIgnoreCase("null")){
            System.err.println("wrong abbreviation");
            System.exit(1);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {
        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if(politicalParty.isBlank()||politicalParty.isEmpty()||politicalParty.equalsIgnoreCase("null")){
            System.err.println("wrong politparty");
            System.exit(1);
        }
        this.politicalParty = politicalParty;
    }


    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {
        if(senator.isBlank()||senator.isEmpty()||senator.equalsIgnoreCase("null")){
            System.err.println("wrong senator");
            System.exit(1);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if(population<=0){
            System.err.println("wrong population");
            System.exit(1);
        }
        this.population = population;
    }

    public double getStateTax() {
        return stateTax;
    }

    public void setStateTax(double stateTax) {
        if (stateTax < 0){
            System.err.println("wrong tax");
            System.exit(1);
        }
        this.stateTax = stateTax;
    }

    public String getGovernor() {
        return governor;
    }

    public void setGovernor(String governor) {
        if(governor.isBlank()||governor.isEmpty()||governor.equalsIgnoreCase("null")){
            System.err.println("wrong governor");
            System.exit(1);
        }
        this.governor = governor;
    }

    public States(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
       setName(name);
       setAbbreviation(abbreviation);
       setPoliticalParty(politicalParty);
       setGovernor(governor);
       setSenator(senator);
       setPopulation(population);
       setStateTax(stateTax);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ " {" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", governor='" + governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                ", stateTax=" + stateTax +
                '}';
    }
}
