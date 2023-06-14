package src.day34_abstractionContinue.carTask;

public class Runner {
    public static void main(String[] args) {

         Honda honda = new Honda("Civic","Black",2019,17000);

         Audi audi = new Audi("Q6","silver",2020,40000);

         Tesla tesla = new Tesla("Model Y", "blue",2022,60000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("-------------------");

        honda.stop();
        audi.stop();
        tesla.stop();

        System.out.println("-------------------");

        honda.start();
        audi.start();
        tesla.start();




    }
}
