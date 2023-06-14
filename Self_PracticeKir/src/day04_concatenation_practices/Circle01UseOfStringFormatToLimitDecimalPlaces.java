package src.day04_concatenation_practices;
public class Circle01UseOfStringFormatToLimitDecimalPlaces {
    public static void main(String[] args) {
                int radius = 5;
                double area = Math.PI * Math.pow(radius, 2);
                double perimeter = Math.PI * 2 * radius;
                System.out.println("Area of the circle is " + String.format("%.1f", area));
                System.out.println("Perimeter of the circle is " + String.format("%.1f", perimeter));
            }
        }

