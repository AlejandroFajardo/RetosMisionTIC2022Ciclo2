package Reto3Var2Persona;

public class Estudiante extends Persona{

    //Inserte acá el método constructor
    public Estudiante(String id, String nombre, String email, String idioma) {
        super(id, nombre, email, idioma);
    }
    
    //Inserte acá la implementación del método abstracto de la clase padre
    @Override
    public void dirigir() {
        setUrl(getUrl() + "/" + getIdioma() + "/estudiante");
    }
}
