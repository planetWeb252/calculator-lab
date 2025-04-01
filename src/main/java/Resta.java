public class Resta {
    private double acumulado = 0;

    public static double Resta(double a, double b) {
        return a - b;
    }

    public static int Resta (int a, int b) {
        return a - b;
    }
    public static double Resta(double a, double b, double c) {
        return a - b - c;
    }
    public void Resta (double valor) {
        acumulado -= valor;
    }
}