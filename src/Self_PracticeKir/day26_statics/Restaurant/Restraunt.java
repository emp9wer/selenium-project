package Self_PracticeKir.day26_statics.Restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restraunt {

    public String owner;
    public String location;
    public int numberOfStars;
    public ArrayList<Server> servers = new ArrayList<>();
    public ArrayList<Chef> chefs = new ArrayList<>();

    public Restraunt(String owner, String location, int numberOfStars) {
        this.owner = owner;
        this.location = location;
        this.numberOfStars = numberOfStars;
    }

    public void hireServer(Server server){
        servers.add(server);
    }
    public void hireServer(Server[] server){
       servers.addAll(Arrays.asList(server));
    }

    public void hireChef(Chef chef){
       chefs.add(chef);
    }
    public  void hireChef(Chef[] chef){
       chefs.addAll(Arrays.asList(chef));
    }

    public void  terminateChef(int employeeID){
        chefs.removeIf(p-> p.employeeID==employeeID);
    }
    public void  terminateServer(int employeeID){
        servers.removeIf(p-> p.employeeID==employeeID);
    }


    public String toString() {
        return "Restraunt{" +
                "owner='" + owner + '\'' +
                ", location='" + location + '\'' +
                ", numberOfStars=" + numberOfStars +
                ", servers=" + servers.size() +
                ", chefs=" + chefs.size() +
                '}';
    }

}
