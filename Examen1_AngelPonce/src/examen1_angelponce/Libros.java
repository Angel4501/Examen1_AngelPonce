package examen1_angelponce;

public class Libros {
    private String autores, titulo , genero , editoriales, idioma, añoEscribio; //anio que se escribio
    private String isbn, anioIngresa; //anio que ingersa a la libreria
    private String estado; //Prestado , disponible y fuera de inventario)
    private String nombrepres; //nombre de l apersona prestado
    private int cuenta; //numero de cuenta de la persona prestado

    public Libros(String autores, String titulo, String genero, String editoriales, 
            String idioma, String añoEscribio, String isbn, 
            String anioIngresa, String estado, String nombrepres, int cuenta) {
        this.autores = autores;
        this.titulo = titulo;
        this.genero = genero;
        this.editoriales = editoriales;
        this.idioma = idioma;
        this.añoEscribio = añoEscribio;
        this.isbn = isbn;
        this.anioIngresa = anioIngresa;
        this.estado = estado;
        this.nombrepres = nombrepres;
        this.cuenta = cuenta;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEditoriales() {
        return editoriales;
    }

    public void setEditoriales(String editoriales) {
        this.editoriales = editoriales;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getAñoEscribio() {
        return añoEscribio;
    }

    public void setAñoEscribio(String añoEscribio) {
        this.añoEscribio = añoEscribio;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAnioIngresa() {
        return anioIngresa;
    }

    public void setAnioIngresa(String anioIngresa) {
        this.anioIngresa = anioIngresa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombrepres() {
        return nombrepres;
    }

    public void setNombrepres(String nombrepres) {
        this.nombrepres = nombrepres;
    }

    public int getCuenta() {
        return cuenta;
    }

    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public String toString() {
        return "Autores=" + autores 
                + "\nTitulo=" + titulo 
                + "\nGenero=" + genero 
                + "\nEditoriales=" + editoriales 
                + "\nIdioma=" + idioma 
                + "\nAnio en que se escribió" + añoEscribio 
                + "\nISBN=" + isbn 
                + "\nAnio que ingresó a biblioteca=" + anioIngresa 
                + "\nEstado=" + estado 
                + "\nNombre persona prestado=" + nombrepres 
                + "\nNo. de cuenta de la persona=" + cuenta;
    }

    
    
    
    
}
