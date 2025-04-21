import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    public List<Perro> listperro =new ArrayList<>();

    public Persona() {
    }

    public Persona(String apellido, String documento, int edad, String nombre) {
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.listperro = listperro;
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public List<Perro> getListperro() {
        return listperro;
    }

    public void setListperro(List<Perro> listperro) {
        this.listperro = listperro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    @Override
    public String toString() {
        return "Persona{" +
                "apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", documento='" + documento + '\'' +
                ", listperro=" + listperro +
                '}';
    }

}
