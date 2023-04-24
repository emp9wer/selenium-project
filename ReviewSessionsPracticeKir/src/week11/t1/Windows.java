package week11.t1;

public class Windows    extends Computer {

    public static void main(String[] args) {
        Windows obj = new Windows();

        System.out.println(obj.os);
        System.out.println(obj.memory);
        System.out.println(obj.brand);
        //obj.hasWifi - this was private - not inherited
        System.out.println(obj);

    }

}
