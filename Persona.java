package Reto3Var2Persona;

public abstract class Persona {
    //Inserte acá los atributos
    private String id;
    private String nombre;
    private String email;
    private String idioma;
    private String url;
    //Inserte acá el método constructor

    public Persona(String id, String nombre, String email, String idioma) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.idioma = idioma;
        url = "educursos.com";
    }
    
    //Inserte acá los SETTERS Y GETTERS
    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getUrl() {
        return url;
    }

    //Inserte acá el método abstracto
    public abstract void dirigir();    
}
