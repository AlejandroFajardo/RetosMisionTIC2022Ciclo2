public abstract class Boton {

    //Inserte acá los atributos
    private double ancho;
    private double alto;
    private String colorFondo;
    private String ColorTexto;
    private String texto;
    //Inserte acá el método constructor
    public Boton(double ancho, double alto, String colorFondo, String ColorTexto, String texto) {
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
        this.ColorTexto = ColorTexto;
        this.texto = texto;
    }
    //Inserte acá los SETTERS Y GETTERS
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public void setColorTexto(String ColorTexto) {
        this.ColorTexto = ColorTexto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }

    public String getColorFondo() {
        return colorFondo;
    }

    public String getColorTexto() {
        return ColorTexto;
    }

    public String getTexto() {
        return texto;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public abstract void hacerClick();
    
    

}