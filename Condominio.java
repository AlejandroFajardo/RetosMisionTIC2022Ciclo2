package Reto4Var3TIC;

import java.util.ArrayList;

public class Condominio {
    
    private ArrayList<Inmueble> inmuebles;

    public Condominio() {
        this.inmuebles = new ArrayList<>();
    }
    
    public void agregarInmueble(Inmueble inmueble){
        inmuebles.add(inmueble);
    }
    
    public void eliminarInmueble(Inmueble inmueble){
        inmuebles.remove(inmueble);
    }
    
    public double calcularArriendoMensualCondominio(){
        double sum = 0;
        for (Inmueble inmueble : inmuebles) {
            sum += inmueble.getCostoMensual();
        }
        return sum;
    }
    
    public double promedioCostoInmueble(){
        return calcularArriendoMensualCondominio()/inmuebles.size();
    }
    
    public double desciavionEstandarCostoInmueble(){
        double de = 0;
        double prom = promedioCostoInmueble();
        double sum = 0;
        for (int i = 0; i < inmuebles.size(); i++) {
            sum += Math.pow((inmuebles.get(i).getCostoMensual() - prom), 2);
        }
        de = Math.sqrt((sum/inmuebles.size()));
        return de;
    }

    public ArrayList<Inmueble> getInmuebles() {
        return inmuebles;
    }

    public void setInmuebles(ArrayList<Inmueble> inmuebles) {
        this.inmuebles = inmuebles;
    }
}
