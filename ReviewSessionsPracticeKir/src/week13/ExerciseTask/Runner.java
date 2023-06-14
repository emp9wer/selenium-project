package week13.ExerciseTask;

public class Runner {
    /*
    create a class Gym to test the objects and methods
     */

    public static void main(String[] args) {

        // Exercise obj = new Exercise();
        // cannot instantiate abstract classes

        Running running = new Running();
        running.perform();
        System.out.println(running.getCaloriesBurned(60));

        System.out.println("--------------------------");

        //  Lifting lifting = new Lifting();
        // cannot instantiate abstract classes

        Bench bench = new Bench();
        bench.rackWeight();
        bench.perform();
        System.out.println(bench.getCaloriesBurned(15));



    }


    }



