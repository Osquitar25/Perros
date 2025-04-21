public class Perro {

    private String placa;
    private String nombre;
    private String raza;
    private int edad;
    private String tamaño;

    public Perro() {
    }

    public Perro(int edad, String nombre, String placa, String raza, String tamaño) {
        this.edad = edad;
        this.nombre = nombre;
        this.placa = placa;
        this.raza = raza;
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "edad=" + edad +
                ", placa='" + placa + '\'' +
                ", nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", tamaño='" + tamaño + '\'' +
                '}';
    }
}
