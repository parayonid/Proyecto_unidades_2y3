package Unidad_3;

public class Volumen {

    public static double calcularVolumen(float lado) {
        return Math.pow(lado, 3);
    }

    public static double calcularVolumen(double lado) {
        return Math.pow(lado, 3);
    }

    public static double calcularVolumen(float radio, float altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static double calcularVolumen(double radio, double altura) {
        return Math.PI * Math.pow(radio, 2) * altura;
    }

    public static double calcularVolumen(float r1, float r2, float r3) {
        return (4.0 / 3.0) * Math.PI * r1 * r2 * r3;
    }

    public static double calcularVolumen(double r1, double r2, double r3) {
        return (4.0 / 3.0) * Math.PI * r1 * r2 * r3;
    }
}