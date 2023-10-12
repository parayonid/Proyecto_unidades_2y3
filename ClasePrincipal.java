package Unidad_3;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        VehiculoDeCarga vehiculo1 = new VehiculoDeCarga();
        VehiculoDeCarga vehiculo2 = new VehiculoDeCarga();
        Scanner leer = new Scanner(System.in);
        char opcion = ' ';
        int seguir = 1;
        int reportes = 0;
        
        float volumenCuboFloat = 0, volumenCilindroFloat =0, volumenElipsoideFloat = 0;
        double volumenCuboDouble = 0, volumenCilindroDouble = 0, volumenElipsoideDouble = 0;
        do {

            try {
                System.out.println("\nMenu.\nIngresa el numero de la opcion deseada:\n1. Instanciar\n2. Desplegar\n3. Calcular\n4. Reportes\n 5. Salir");
                String input = leer.nextLine();
                if (!input.isEmpty()) {
                    opcion = input.charAt(0);
                }
                
                switch (opcion) {
                    case '1' -> {

                        System.out.print("Ingresa el numero del vehiculo: ");
                        int numeroDeVehiculo = leer.nextInt();
                        leer.nextLine();
                        vehiculo2.setNumerodeVehiculo(numeroDeVehiculo);
                        System.out.println("Dame el peso tara: ");
                        int tara = leer.nextInt();
                        vehiculo2.setTara(tara);
                        System.out.println("Dame la capacidad maxima: ");
                        int capMax = leer.nextInt();
                        leer.nextLine();
                        vehiculo2.setCapMax(capMax);
                        boolean pesovalido = false;
                        do {
                            System.out.println("Dame el peso de la carga");
                            int net = leer.nextInt();
                            leer.nextLine();
                            try {
                                vehiculo2.setNet(net);
                                pesovalido = true;
                            } catch (PesoSuperado pesomayor) {
                                System.out.println("Peso excede la capacidad maxima");
                            }
                        } while (pesovalido == false);
                        boolean tipovalido = false;
                        do {
                            System.out.println("Dame el tipo de vehiculo: ");
                            String tipoVehiculo = leer.nextLine().toLowerCase();
                            try {
                                vehiculo2.setTipo(tipoVehiculo);
                                tipovalido = true;
                            } catch (TipoNoValido e) {
                                System.out.println("Tipo de vehiculo no aceptado. Debe ser 'camion', 'torton' o 'trailer'.");
                            }
                        } while (!tipovalido);

                        System.out.println("Dame las placas: ");
                        String placas = leer.nextLine();
                        vehiculo2.setPlacas(placas);

                        opcion = ' ';
                        System.out.println("Vehiculos instanciados");
                        reportes++;
                    }

                    case '2' -> {
                        if(!vehiculo2.getTipo().equals("sin tipo")){
                        System.out.println("Vehiculo por defecto: " + vehiculo1);
                        System.out.println("Vehiculo modificado: "+vehiculo2);    
                        }else{
                            System.out.println("No se ha instanciado ningun objeto");
                        }
                        opcion = ' ';
                    }
                    case '3'->{
                        System.out.println("Ingresa el lado del cubo float: ");
                        float ladoFloat = leer.nextFloat();
                        leer.nextLine();
                        System.out.println("Ingresa el lado del cubo double: ");
                        double ladoDouble = leer.nextDouble();
                        leer.nextLine();
                        System.out.println("Ingresa el radio del cilindro float: ");
                        float radioFloat = leer.nextFloat();
                        leer.nextLine();
                        System.out.println("Ingresa la altura del cilindro float: ");
                        float alturaFloat = leer.nextFloat();
                        leer.nextLine();
                        System.out.println("Ingresa el radio del cilindro double: ");
                        double radioDouble = leer.nextDouble();
                        leer.nextLine();
                        System.out.println("Ingresa la altura del cilindro double: ");
                        double alturaDouble = leer.nextDouble();
                        leer.nextLine();
                        System.out.println("Ingresa el primer semieje del elipsoide float: ");
                        float semieje1Float = leer.nextFloat();
                        leer.nextLine();
                        System.out.println("Ingresa el segundo semieje del elipsoide float: ");
                        float semieje2Float = leer.nextFloat();
                        leer.nextLine();
                        System.out.println("Ingresa el tercero semieje del elipsoide float: ");
                        float semieje3Float = leer.nextFloat();
                        leer.nextLine();
                        System.out.println("Ingresa el primer semieje del elipsoide double: ");
                        double semieje1Double = leer.nextDouble();
                        leer.nextLine();
                        System.out.println("Ingresa el segundo semieje del elipsoide double: ");
                        double semieje2Double = leer.nextDouble();
                        leer.nextLine();
                        System.out.println("Ingresa el tercer semieje del elipsoide double: ");
                        double semieje3Double = leer.nextDouble();
                        leer.nextLine();
                        volumenCuboFloat = (float) Volumen.calcularVolumen(ladoFloat);
                        volumenCilindroFloat = (float) Volumen.calcularVolumen(radioFloat, alturaFloat);
                        volumenElipsoideFloat = (float) Volumen.calcularVolumen(semieje1Float, semieje2Float,semieje3Float);
                        volumenCuboDouble = Volumen.calcularVolumen(ladoDouble);
                        volumenCilindroDouble = Volumen.calcularVolumen(radioDouble, alturaDouble);
                        volumenElipsoideDouble = Volumen.calcularVolumen(semieje1Double, semieje2Double,semieje3Double);
                        System.out.println("El area del cubo float es: "+volumenCuboFloat);
                        System.out.println("El area del cubo double es: "+volumenCuboDouble);
                        System.out.println("El area del cilindro floates: "+volumenCilindroFloat);
                        System.out.println("El area del cilindro double es: "+volumenCilindroDouble);
                        System.out.println("El area del elipsoide float es: "+volumenElipsoideFloat);
                        System.out.println("El area del elipsoide double es: "+volumenElipsoideDouble);
                        
                        reportes++;
                        opcion = ' ';
                    }
                    case '4'->{
                        if (reportes == 2){
                        System.out.println("\nReportes:\nVehiculos instanciados:\nVehiculo 1:"+vehiculo1+"\nvehiculo 2:"+vehiculo2);
                        System.out.println("Metodos sobrecargados: ");
                         System.out.println("El area del cubo float es: "+volumenCuboFloat);
                        System.out.println("El area del cubo double es: "+volumenCuboDouble);
                        System.out.println("El area del cilindro floates: "+volumenCilindroFloat);
                        System.out.println("El area del cilindro double es: "+volumenCilindroDouble);
                        System.out.println("El area del elipsoide float es: "+volumenElipsoideFloat);
                        System.out.println("El area del elipsoide double es: "+volumenElipsoideDouble);
                        }else{
                            System.out.println("Aun no puedes ver los reportes, asegurate de instanciar los vehiculos y realizar los calculos primero.");
                        }
                    }
                    case '5'->{
                        seguir = 0;
                    }
                    default -> {
                        System.out.println("Opcion no valida");
                    }
                }

            } catch (Exception e) {
                System.out.println("Excepcion: " + e);
            }
        } while (seguir == 1);
        System.out.println("Saliste del menu");
    }
}
