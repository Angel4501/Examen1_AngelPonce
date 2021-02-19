package examen1_angelponce;

public class Usuarios {
    String nombre, pass, admin;

    public Usuarios() {
    }
    
    public Usuarios(String nombre, String pass, String admin) {
        this.nombre = nombre;
        this.pass = pass;
        this.admin = admin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
