public class UnitConverter {
    // Celsius a Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit a Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Grados a Radianes
    public static double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180;
    }

    // Radianes a Grados
    public static double radiansToDegrees(double radians) {
        return radians * 180 / Math.PI;
    }

    public static void main(String[] args) {
        System.out.println(celsiusToFahrenheit(25)); // ejecutamos el método
        System.out.println(fahrenheitToCelsius(30));
        System.out.println(degreesToRadians(20));
        System.out.println(radiansToDegrees(55));
    }
}