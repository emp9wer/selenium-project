package day31_methodOverriding.statesTask;

public class StateObjects {
    public static void main(String[] args) {

        California california = new California("California","CA","Democrat","Donald Duck","Mickey Mouse",100000,15.4);

        System.out.println(california);
        california.cpu();
    }

}
