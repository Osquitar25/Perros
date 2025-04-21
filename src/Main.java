import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        List<Persona> listpers=new ArrayList<>();
        Persona persona2 = new Persona();

        int opc;
        do {
            System.out.println("""
                |                    ------MENU------                       |
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
                    System.out.println("Digite su tamaño");
                    tama= teclado.next();
                    persona2.listperro.add(pla,nom,ra,edad,tama);

                }
                case 3->{

                }
                case 4->{
                    for (Perro i : persona2.listperro) {
                        System.out.println(" " + i);
                    }
                }
                case 5->{

                }
                case 6->{

                }
                case 7->{

                }
            }
        }while (opc!=7);

    }
}