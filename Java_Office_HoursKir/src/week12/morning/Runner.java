package week12.morning;

public class Runner {
    public static void main(String[] args) {

        Instagram instagram = new Instagram("instagram",1.2);

        instagram.download();
        instagram.postPic();
        System.out.println(instagram);


    }
}
