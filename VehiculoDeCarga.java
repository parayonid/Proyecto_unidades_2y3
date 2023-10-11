package Unidad_3;

public class VehiculoDeCarga {

    double CapMax, net, tara;
    String tipo, placas;
    int NumerodeVehiculo;

    VehiculoDeCarga() {
        NumerodeVehiculo = 0;
        tipo = "";
        placas = "";
        CapMax = 0;
        net = 0;
        tara = 0;
    }

    VehiculoDeCarga(int NumerodeVehiculo, int CapMax, int tara, int net, String tipo, String placas) {
        this.NumerodeVehiculo = NumerodeVehiculo;
        boolean continuar = false;
        do{
        try{
            setTipo(tipo);
            continuar = true;
        }catch(TipoNoValido TipoIncorrecto){
            System.out.println("Tipo de vehiculo no aceptado");
        }
        }while(continuar == false);
        
        this.placas = placas;
        this.CapMax = CapMax;
        this.net = net;
        this.tara = tara;

    }

    public int getNumerodeVehiculo() {
        return NumerodeVehiculo;
    }

    public void setNumerodeVehiculo(int NumerodeVehiculo) {
        this.NumerodeVehiculo = NumerodeVehiculo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) throws TipoNoValido {
    tipo = tipo.toLowerCase();
    if (tipo.equals("camion") || tipo.equals("torton") || tipo.equals("trailer")) {
        this.tipo = tipo;
    } else {
        throw new TipoNoValido("Tipo no válido");
    }
}
        
    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placas) {
        this.placas = placas;
    }

    public double getCapMax() {
        return CapMax;
    }

    public void setCapMax(double CapMax) {
        this.CapMax = CapMax;
    }

    public double getNet() {
        return net;
    }

    public void setNet(int net) throws PesoSuperado {
       if(net+tara <= CapMax){
           this.net = net;
       }else{
           throw new PesoSuperado("El peso supera la capacidad maxima");
       }
    }

    public double getTara() {
        return tara;
    }

    public void setTara(double tara) {
        this.tara = tara;
    }

    public double getPesoBruto() {
        return net + tara;
    }

    @Override
    public String toString() {
        return "Numero de vehículo: " + NumerodeVehiculo + "\n Tipo: " + tipo + "\n Placas: " + placas + "\n Capacidad Máxima Bruta: " + CapMax
                + "\n Peso Neto(net): " + net + "\n Peso Tara(tara): " + tara + "\n Peso Bruto: " + getPesoBruto();
    }

}
