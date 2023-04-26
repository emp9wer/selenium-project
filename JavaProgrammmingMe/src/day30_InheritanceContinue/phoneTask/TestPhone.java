package src.day30_InheritanceContinue.phoneTask;

public class TestPhone {
    public static void main(String[] args) {

       Iphone iphone = new Iphone("Iphone 12 pro max ","12.9","Gold",1200);
       Samsung samsung = new Samsung("Galaxy s22","13.2","White",1100);
       Nokia nokia = new Nokia("Brick","Small","Pink",50 );

       iphone.call(911);
       samsung.call(911);
       nokia.call(911);

       iphone.text(4123332224L);
       samsung.text(4123332224L);
       nokia.text(4123332224L);

       iphone.faceTime(412412312);
       iphone.faceTime("fasafafa@gmail.com");

       samsung.freeze();

       nokia.selfDefence();

    }
}
