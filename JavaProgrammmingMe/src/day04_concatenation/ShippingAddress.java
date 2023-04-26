package src.day04_concatenation;

public class ShippingAddress {
    public static void main(String[] args) {
        String name = "Aaron";
        String lastName = "Kissinger";
        String fullName = name + " " + lastName;
        String streetName = "Legacy Circle";
        String city = "Fairfax";
        String state = "VA";
        String addressNumber = "1362A";
        String yourShippingAddressIs = "Your Shipping address is:";
        String zipCode = "22030";
        System.out.println(yourShippingAddressIs + "\n\t" + fullName + "\n\t" + addressNumber + " " + streetName +
                "\n\t" + city + ", " + state + " " + zipCode );
        System.out.println("\n\tC\n\t\tY\n\t\t\tD\n\t\t\t\tE\n\t\t\t\t\tO");

    }


}
/*
1. Create a class named ShippingAddress.java
2. Declare the following variables:
1. name
2. buildingNumber
3. streetName
4. city
5. state
6. zipCode
3. Use concatenation to print the full shipping address
Ex:
Your Shipping address is:
Aaron Kissinger
13621A Legacy Circle
Fairfax, VA 22030
*/