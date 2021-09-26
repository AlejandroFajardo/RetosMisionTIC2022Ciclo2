public class BotonPrueba extends Boton {
   
    //Inserte acá el método constructor
    public BotonPrueba(double ancho, double alto, String colorFondo, String ColorTexto, String texto) {
        super(ancho, alto, colorFondo, ColorTexto, texto);
    }
    //Inserte acá la implementación del método abstracto de la clase padre
    @Override
    public void hacerClick() {
        this.setTexto("Hellow World!");
    }
}