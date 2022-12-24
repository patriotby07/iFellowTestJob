import java.util.Scanner;

public class BaseConverter {
    static String convert(double celsius, String type) {

        if (type.equals("k")) {
            return String.format("Degrees in Kelvin = " + "%.2f", (celsius * 9 / 5) + 32);
        } else if (type.equals("f")) {
            return String.format("Degrees in Fahrenheit = " + "%.2f", celsius + 273.15);
        }

        return "Incorrect data entered";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter degrees Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println("Enter 'F' conversion to Fahrenheit, 'K' conversion to Kelvin: ");
        String type = sc.next().toLowerCase();
        sc.close();
        System.out.println(convert(celsius, type));

    }
}
