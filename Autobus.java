package Reto2Var3Bus;

public class Autobus extends Vehiculo {

    //              ^ (Autobus hereda de Vehiculo)
    //Inserte acá los atributos
    private boolean puertaAbierta;
    //Inserte acá el método constructor

    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
        puertaAbierta = false;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void recogerPasajero(int estrato) {
        if (!isEnMarcha() && puertaAbierta) {
            if (getnMaximoPasajeros() >= (getnPasajeros() + 1)) {
                setCantidadDinero(getCantidadDinero() + this.calcularPasaje(estrato));
                setnPasajeros(getnPasajeros() + 1);
            }
        }
    }

    @Override
    public void gestionarMarcha() {
        if (isMotorEncendido() && !isEnMarcha() && !puertaAbierta) {
            setEnMarcha(true);
        } else {
            setEnMarcha(false);
        }
    }

    public void gestionarPuerta() {
        if (!isEnMarcha() && !puertaAbierta) {
            puertaAbierta = true;
        } else {
            puertaAbierta = false;
        }
    }

    public static double calcularPasaje(int estrato) {
        if (estrato >= 0 && estrato <= 2) {
            return 1500;
        } else if (estrato > 2 && estrato < 5) {
            return 2600;
        } else {
            return 3000;
        }
    }

    //Inserte acá los SETTERS Y GETTERS
    public boolean isPuertaAbirta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
}
