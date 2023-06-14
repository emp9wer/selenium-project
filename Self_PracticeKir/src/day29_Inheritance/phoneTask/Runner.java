package src.day29_Inheritance.phoneTask;

public class Runner {
    public static void main(String[] args) {


        Iphone i1 = new Iphone();
        i1.setInfo("dgasgsgsgsgsdgasdga","12",12,222,"blue");
        System.out.println(i1);
        i1.call(121212l);


        Samsung s1 =  new Samsung();
        s1.setInfo("sDGsDGsDGsdSDGsdgs","galaxy",12,1211,"black");
        System.out.println(s1);
        s1.call(2121414124l);
        s1.freeze();




    }
}
