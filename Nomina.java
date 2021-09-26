package reto4TIC;
//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;
public class Nomina {

    //Inserte acá los atributos
    private ArrayList<Trabajador> trabajadores;
    //Inserte acá el método constructor
    public Nomina() {
        this.trabajadores = new ArrayList<>();
    }
    //Inserte acá los SETTERS Y GETTERS
    public ArrayList<Trabajador> getTrabajadores() {
        return trabajadores;
    }
    
    public void setTrabajadores(ArrayList<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void agregarTrabajador(Trabajador trabajador){
        trabajadores.add(trabajador);
    }
    
    public void eliminarTrabajador(String cc){
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getCC().equals(cc)) {
                trabajadores.remove(trabajador);
                break;
            }
        }
    }

    public double calcularSalarioQuincenalNomina(){
        double salary = 0;
        for (Trabajador trabajador : trabajadores) {
            salary += trabajador.salarioQuincenal();
        }
        return salary;
    }
    
    public double promedioEdadNomina(){
        int edades = 0;
        for (Trabajador trabajador : trabajadores) {
            edades += trabajador.calcularEdad();
        }
        return (double)edades/trabajadores.size();
    }
    
    public double desviacionEstandarEdadNomina(){
        double de = 0;
        double prom = promedioEdadNomina();
        double sum = 0;
        for (int i = 0; i < trabajadores.size(); i++) {
            sum += Math.pow((trabajadores.get(i).calcularEdad() - prom), 2);
        }
        de = Math.sqrt((sum/trabajadores.size()));
        return de;
    }

    public double salarioQuincenalTrabajador(String cc){
        for (Trabajador trabajador : trabajadores) {
            if (trabajador.getCC() == cc) {
                return trabajador.salarioQuincenal();
            }
        }
        return 0;
    }
}