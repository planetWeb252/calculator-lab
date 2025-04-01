public class Sum {

    static double  acumulado=0.0;


    public static double sumDoubles(double num1,double num2){
        return num1+num2;
    }

    public static int sumInt (int num1,int num2){
        return num1+num2;
    }

    public static double sumThreeDoubles(double num1,double num2,double num3){
        return num1+num2+num3;
    }

    public static void acumuladoNumero(double num1){
         acumulado+=num1;
        System.out.println("numero acumulado: "+acumulado);
    }




}
