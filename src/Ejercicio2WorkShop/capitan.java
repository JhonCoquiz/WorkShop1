package Ejercicio2WorkShop;

public class capitan {

    private String nombre;
    private String apellido;
    private String matriculaDenavegacion;

    public capitan() {
    }

    public capitan(String nombre, String apellido, String matriculaDenavegacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDenavegacion = matriculaDenavegacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMatriculaDenavegacion() {
        return matriculaDenavegacion;
    }

    public void setMatriculaDenavegacion(String matriculaDenavegacion) {
        this.matriculaDenavegacion = matriculaDenavegacion;
    }
}
