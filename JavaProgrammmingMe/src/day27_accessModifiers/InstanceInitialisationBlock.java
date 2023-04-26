package src.day27_accessModifiers;

public class InstanceInitialisationBlock {

    public String name;
    public int age;

  //  { // instance block
    //    name = "James";
    //    age =20;
   // }

    public InstanceInitialisationBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        InstanceInitialisationBlock obj1 = new InstanceInitialisationBlock("babba",22);
        InstanceInitialisationBlock obj2 = new InstanceInitialisationBlock("fafa", 32);

        System.out.println(obj1.name);
        System.out.println(obj1.age);
        System.out.println("---------------");
        System.out.println(obj2.name);
        System.out.println(obj2.age);




    }


}
