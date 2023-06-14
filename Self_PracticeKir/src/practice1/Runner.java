package src.practice1;

public class Runner {
    public static void main(String[] args) {

        Entrepreneur gleb = new Entrepreneur("Gleb Kandakov",21,true);

        gleb.eat("shawarma");
        gleb.poop();
        gleb.makeBusiness();
        System.out.println(gleb);


    }
}
