package Self_PracticeKir.day31_methodOverriding.statesTask;

public class California extends States{
    public California(String name, String abbreviation, String politicalParty, String governor, String senator, int population, double stateTax) {
        super(name, abbreviation, politicalParty, governor, senator, population, stateTax);
    }

    public void cpu(){
        System.out.println(getName()+" is making cpu's");
    }
}
