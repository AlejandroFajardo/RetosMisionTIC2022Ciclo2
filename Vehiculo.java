package Reto2Var3Bus;

public abstract class Vehiculo {
    
    //Inserte acá los atributos
    private String nombreConductor;
    private int nPasajeros;
    private int nMaximoPasajeros;
    private double cantidadDinero;
    private double localizacionX;
    private double localizacionY;
    private boolean aireAcondicionadoActivado;
    private boolean motorEncendido;
    private boolean wifiEncendido;
    private boolean enMarcha;
    
    //Inserte acá el método constructor

    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
        this.cantidadDinero = 0;
        this.nPasajeros = 0;
        this.localizacionX = 0;
        this.localizacionY = 0;
        this.aireAcondicionadoActivado = false;
        this.motorEncendido = false;
        this.wifiEncendido = false;
        this.enMarcha = false;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void dejarPasajero(){
        if (nPasajeros > 0) {
            nPasajeros -= 1;
        }
    }
    
    public double calcularDistanciaAcopio(){
        return (Math.hypot(localizacionX, localizacionY));
    }
    
    public void gestionarAireAcondicionado(){
        if (motorEncendido && !aireAcondicionadoActivado) {
            aireAcondicionadoActivado = true;
        }else{
            aireAcondicionadoActivado = false;
        }
    }
    
    public void gestionarMotor(){
        if (!motorEncendido) {
            motorEncendido = true;
        }else{
            motorEncendido = false;
            aireAcondicionadoActivado = false;
            wifiEncendido = false;
            enMarcha = false;
        }
    }
    
    public void gestionarWifi(){
        if (motorEncendido && !wifiEncendido) {
            wifiEncendido = true;
        }else{
            wifiEncendido = false;
        }
    }
 
    public abstract void gestionarMarcha();
    
    public void moverDerecha(double distance){
        if (enMarcha) {
            localizacionX += distance;
        }
    }
    
    public void moverIzquierda(double distance){
        if (enMarcha) {
            localizacionX -= distance;
        }
    }
    
    public void moverArriba(double distance){
        if (enMarcha) {
            localizacionY += distance;
        }
    }
    
    public void moverAbajo(double distance){
        if (enMarcha) {
            localizacionY -= distance;
        }
    }
    
    //Inserte acá los SETTERS Y GETTERS

    public String getNombreConductor() {
        return nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    
}
