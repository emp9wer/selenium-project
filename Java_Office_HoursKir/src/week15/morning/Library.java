package week15.morning;

public class Library {
    public static void getLibraryCard(String city) {
        if (city.equals("Fairfax") || city.equals("McLean")){
            System.out.println("library card created");
    }else{
            throw new NonresidentException(city+ " is  invalid city");
        }

    }

    public static void borrow(boolean checkOut) throws FailToCheckOutException {

        if(!checkOut){
            throw new FailToCheckOutException("sorry you can not checkout");
        }
        System.out.println("Enjoy reading");
    }

}
/*
Create a class Library

    create a method getLibraryCard(String city)

        if the city is Fairfax or McLean print Library Card Created

        but if it is any other city throw your NonResidentException
            -> give a message in the constructor call

    create a method borrow(boolean checkedOut)

        if the given checkedOut boolean is true print "Enjoy reading"

        but if the boolean is false throw your FailToCheckOutException

        -> handle this exception in the runner file
 */