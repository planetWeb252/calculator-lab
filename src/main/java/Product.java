public class Product {
    // Multiplicación de dos números reales
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Multiplicación de dos números enteros
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Multiplicación de tres números reales
    public static double multiply(double a, double b, double c) {
        return a * b * c;
    }

    // Potencia
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public static void main(String[] args) {
        System.out.println(multiply(2,3)); // ejecutamos el método
        System.out.println(multiply(3,5));
        System.out.println(multiply(2,3,4));
        System.out.println(power(5,3));
    }
}