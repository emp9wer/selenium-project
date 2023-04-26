package src.day17_ClassObjectIntro;

public class Dog {                                  //    class name

    public String name;    //   instance variable   //    fields  attributes
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String color;
    //                         "Max"        "Husky"
    public void setInfo(String name, String breed ,char gender,int age,String size, String color){
        this.name = name; // this. keyword used for calling the instance variable name
        this.breed=breed;
        this.gender=gender;
        this.age=age;
        this.size = size;
        this.color=color;
    }



    public void eat(){                              //     methods  actions
        System.out.println(name+" is eating");
    }
    public void drink(){                            //     methods  actions
        System.out.println(name + " is drinking water");
    }


    public String toString() { // to avoid hashh code whhen we pring the class objects

        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
