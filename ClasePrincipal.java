package Unidad_3;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        VehiculoDeCarga vehiculo1 = new VehiculoDeCarga();
        VehiculoDeCarga vehiculo2 = new VehiculoDeCarga();
        Scanner leer = new Scanner(System.in);
        char opcion = ' ';
        int seguir = 1;
        do {

            try {
                System.out.println("Menu.\nIngresa el numero de la opcion deseada:\n1. Instanciar\n2. Desplegar\n3. Calcular\n4. Reportes\n 5. Salir");
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
                    }

                    case '2' -> {
                        if(!vehiculo2.getTipo().equals("")){
                        System.out.println("Vehiculo por defecto: " + vehiculo1);
                        System.out.println("Vehiculo modificado: "+vehiculo2);    
                        }else{
                            System.out.println("No se ha instanciado ningun objeto");
                        }
                        opcion = ' ';
                    }
                    case '3'->{
                        
                    }
                    case '4'->{
                        System.out.println("\nReportes:\nVehiculos instanciados:\nVehiculo 1:"+vehiculo1+"\nvehiculo 2:"+vehiculo2);
                        System.out.println("Metodos sobrecargados: ");
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
