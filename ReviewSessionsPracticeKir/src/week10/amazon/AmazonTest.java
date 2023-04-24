package week10.amazon;

public class AmazonTest {

    public static void main(String[] args) {
        AmazonAccount acc1 = new AmazonAccount("javaisCool", "sdgsdgsgsdg@gmail.com",false);

        System.out.println(acc1.getEmail());
        acc1.setEmail("javajoba@gmail.com");
        System.out.println(acc1.getEmail());
    }

}
