package week13.ExerciseTask;

public final class Bench extends Lifting {
    /*
    create a class Bench
	inherit the Lifting class and implement the abstract methods
		for calories method return minutes * 5
     */
    @Override
    public void perform() {
        System.out.println("bench pressing");
    }

    @Override
    public int getCaloriesBurned(int minutes) {
       return minutes*5;
    }

    @Override
    public void rackWeight() {
        System.out.println("racking on top");
    }

}
