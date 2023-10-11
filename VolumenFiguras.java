public class Volumen {
    public static double calcularVolumen(float a) {
        return Math.pow(a, 3);
    }

    public static double calcularVolumen(double a) {
        return Math.pow(a, 3);
    }

    public static double calcularVolumen(float r, float h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double calcularVolumen(double r, double h) {
        return Math.PI * Math.pow(r, 2) * h;
    }

    public static double calcularVolumen(float r1, float r2, float r3) {
        return (4.0 / 3.0) * Math.PI * r1 * r2 * r3;
    }

    public static double calcularVolumen(double r1, double r2, double r3) {
        return (4.0 / 3.0) * Math.PI * r1 * r2 * r3;
    }

    public static void main(String[] args) {
        float ladoCubo = 5.0f;
        double radioCilindro = 3.0;
        double alturaCilindro = 8.0;
        float semieje1Elipsoide = 3.0f;
        float semieje2Elipsoide = 4.0f;
        double semieje3Elipsoide = 5.0;

        double volumenCuboFloat = calcularVolumen(ladoCubo);
        double volumenCilindroDouble = calcularVolumen(radioCilindro, alturaCilindro);
        double volumenElipsoideFloat = calcularVolumen(semieje1Elipsoide, semieje2Elipsoide, semieje3Elipsoide);

        System.out.println("Volumen del cubo: " + volumenCuboFloat);
        System.out.println("Volumen del cilindro: " + volumenCilindroDouble);
        System.out.println("Volumen del elipsoide: " + volumenElipsoideFloat);
    }
}
