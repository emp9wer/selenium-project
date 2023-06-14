package src.day36_polymorphism;

public class Square {

    private double side;

    public  Square(double side){

        this.side = side;
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof Circle)){
            System.err.println("invalid object");
            System.exit(1);
        }
        if(side==((Square)obj).side){
            return true;
        }
            return false;
    }




}
