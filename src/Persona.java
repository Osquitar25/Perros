import java.util.ArrayList;
import java.util.List;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String documento;

    public List<Perro> listperro;

    public Persona() {
    }

    public Persona(String apellido, String documento, int edad, String nombre) {
        this.apellido = apellido;
        this.documento = documento;
        this.edad = edad;
        this.listperro = new ArrayList<>();
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

    public boolean AdoptarPerro(Perro perro){
        if (listperro.size()>=3){
            return false;
        }else {
            listperro.add(perro);
            return true;
        }
    }

    public String perroMasGrande(){

        Perro perroviejo=listperro.get(0);

        for (Perro perro: listperro){
            if (perro.getEdad()> perroviejo.getEdad()){
                perroviejo=perro;
            }
        }
        System.out.println("El perro mas viejo tiene la edad de: "+perroviejo.getEdad());
        return perroviejo.getNombre();
    }
    @Override
    public String toString() {
        return "---------------------------------------------" +
                "\n||APELLIDO: " + apellido  +
                "\n||NOMBRE: " + nombre + '\'' +
                "\n||EDAD: " + edad +
                "\n||DOCUMENTO: " + documento + '\'' +
                "\n||LISTA DE PERROS: " + listperro +
                "\n--------------------------------------------";
    }

}
