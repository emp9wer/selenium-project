package src.week4.evening;

public class T3Habitat {
    public static void main(String[] args) {

        String habitat = "jungle";
        String animals = "";


        switch (habitat){
            case "grassland":
                animals = "goats, bison, badgers, coyotes";
                break;
            case "jungle":
                animals = "snakes, tigers, gorillas, rhinos, toucans";
                break;
            case "city":
                animals = "dogs, cats, gulls, squirrels";
                break;
            case "safari":
                animals = "lion, hippo, giraffe, zebras, elephants";
                break;



        }
        System.out.println("In the "+habitat+" you will be able to find: "+animals);
    }
}
