package src.day25_constructor;

public class ConstructorIntro {

    public ConstructorIntro(){
        System.out.println("object is created by using no argument constructor");
    }

   public ConstructorIntro(int a){
       System.out.println("object is created by using int argument constructor");
   }


    public void add(){
    }

    public static void main(String[] args) {

         ConstructorIntro obj1 = new ConstructorIntro(10);
         ConstructorIntro obj2 = new ConstructorIntro(10);
         ConstructorIntro obj3 = new ConstructorIntro(10);



    }
}
