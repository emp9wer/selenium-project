package src.day18_garbageCollection;

import src.day17_ClassObjectIntro.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        String s1 = "Java"; // obj has ref name - not eligible for GC (Garbage Collection)

        s1 = null; // now its eligible for GC

        // null does not take space in memory

        String str1 = "Python"; // collected by GC (is redundant)
        str1 = "java";
        System.out.println(str1);

        Dog dog1 = new Dog();
        dog1.setInfo("Loki","Chow chow",'M',3,"Medium","Black");

        Dog dog2 = new Dog();
        dog2.setInfo("Babasya","bulldog",'F',2,"Large","White");

       // dog1=null; // GC
         dog1 = dog2; // dog1 eligible for GC after this line

        System.out.println(dog1);
        System.out.println(dog2);


      //  new Dog().finalize(); // to GC every object has it - implicitly used // no need to call it








    }

}
