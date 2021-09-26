package Reto2Var3Bus;

public class Taxi extends Vehiculo {

    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos
    private double distanciaRecorrida;
    private boolean segurosActivados;
    private boolean panic;

    //Inserte acá el método constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor, 1);
        distanciaRecorrida = 0;
        segurosActivados = false;
        panic = false;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void reiniciarTaximetro() {
        distanciaRecorrida = 0;
    }

    public void presionarBotonPanico() {
        segurosActivados = false;
        panic = true;
        super.dejarPasajero();
        gestionarMarcha();
        reiniciarTaximetro();
    }

    @Override
    public void dejarPasajero() {
        if (panic) {
            super.dejarPasajero();
        }
        if (!segurosActivados) {
            super.dejarPasajero();
            setCantidadDinero(calcularPasaje());
            reiniciarTaximetro();
        }
    }

    public void recogerPasajero() {
        if (!isEnMarcha()) {
            if (getnMaximoPasajeros() >= (getnPasajeros() + 1)) {
                setnPasajeros(getnPasajeros() + 1);
            }
        }
    }
    
    @Override
    public void gestionarMarcha() {
        if (!isEnMarcha() && segurosActivados) {
            setEnMarcha(true);
        }else{
            setEnMarcha(false);
        }
    }
    
    public void gestionarSeguros() {
        if (!isEnMarcha() && segurosActivados) {
            segurosActivados = false;
        }else{
            segurosActivados = true;
        }
    }

    @Override
    public void moverAbajo(double distance) {
        super.moverAbajo(distance);
        if (getnPasajeros() > 0 && isEnMarcha()) {
            distanciaRecorrida += distance;
        }
    }

    @Override
    public void moverArriba(double distance) {
        super.moverArriba(distance); 
        if (getnPasajeros() > 0 && isEnMarcha()) {
            distanciaRecorrida += distance;
        }
    }

    @Override
    public void moverDerecha(double distance) {
        super.moverDerecha(distance); 
        if (getnPasajeros() > 0 && isEnMarcha()) {
            distanciaRecorrida += distance;
        }
    }

    @Override
    public void moverIzquierda(double distance) {
        super.moverIzquierda(distance);
        if (getnPasajeros() > 0 && isEnMarcha()) {
            distanciaRecorrida += distance;
        }
    }
    
    
    
    //Inserte acá los SETTERS Y GETTERS
    public double calcularPasaje() {
        return 3000 + (2300 * distanciaRecorrida);
    }

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }
    
    
}
