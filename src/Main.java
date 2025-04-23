import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        List<Persona> listpers=new ArrayList<>();
        List<Perro>listperrodis=new ArrayList<>();

        int opc;
        do {
            System.out.println("""
                |--------------------------MENU-----------------------------|
                |1)Registrar personas                                       |
                |2)Registrar perros                                         | 
                |3)Ver personas registradas.                                |
                |4)Ver perros disponibles.                                  |
                |5)Adoptar perro                                            |
                |6)Consultar el perro más viejo adoptado por una persona.   |
                |7)Salir                                                    |
                |-----------------------------------------------------------|""");
            opc= teclado.nextInt();

            switch (opc){
                case 1 -> {
                    String nom,ape,docu;
                    int edad;

                    System.out.println("Digite su nombre");
                    nom= teclado.next();
                    System.out.println("Digite su apellido");
                    ape= teclado.next();
                    System.out.println("Digite su documento");
                    docu= teclado.next();
                    System.out.println("Digite su edad");
                    edad= teclado.nextInt();
                    System.out.println("Persona registrada con exito :)");
                    listpers.add(new Persona(ape,docu,edad,nom));
                }
                case 2-> {
                    String pla,nom, ra,tama;
                    int edad;

                    System.out.println("Digite su placa");
                    pla= teclado.next();
                    System.out.println("Digite su nombre");
                    nom= teclado.next();
                    System.out.println("Digite su raza");
                    ra= teclado.next();
                    System.out.println("Digite su edad");
                    edad= teclado.nextInt();
                    System.out.println("Digite su tamaño:  (PEQUEÑO-MEDIANO-GRANDE)");
                    tama= teclado.next();
                    System.out.println("Perro registrado con exito ");
                    Perro nuevoperro = new Perro(edad,nom,pla,ra,tama);
                    listperrodis.add(nuevoperro);

                }
                case 3->{
                    for (Persona i : listpers) {
                        System.out.println(" " + i);
                    }
                }
                case 4->{
                    for (Perro i : listperrodis) {
                        System.out.println(" " + i);
                    }
                }
                case 5->{
                    String placa,doc;

                    System.out.println("Digite su documento");
                    doc= teclado.next();
                    System.out.println("Digite la placa del perro que desea adoptar ");
                    placa= teclado.next();

                    Perro perroAdoptar=null;
                    Persona personaAdopta = null;

                    for (Persona persona : listpers){
                        if (persona.getDocumento().equals(doc)){
                            personaAdopta=persona;
                        }
                    }

                    for (Perro perro: listperrodis){
                        if (perro.getPlaca().equals(placa) ){
                            perroAdoptar=perro;
                        }
                    }

                    if (personaAdopta.AdoptarPerro(perroAdoptar)){
                        listperrodis.remove(perroAdoptar);
                        System.out.println("Perro adoptado con exito");
                    }else {
                        System.out.println("Ya supero su limite de adopcion");
                    }
                }
                case 6->{
                    String doc;

                    System.out.println("Digite su documento");
                    doc= teclado.next();

                    Persona personaAdopto = null;
                       for (Persona persona:listpers){
                           if (persona.getDocumento().equals(doc)){
                               personaAdopto=persona;
                               System.out.println(" "+personaAdopto.perroMasGrande());
                           }else {
                               System.out.println("Persona no encontrada");
                           }
                       }
                }
                case 7->{
                    System.out.println("Saliendo \uD83D\uDE06...");
                }default -> System.out.println("***Opcion invalida***");
            }
        }while (opc!=7);

    }
}