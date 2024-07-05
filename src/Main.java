import clases.Biblioteca;
import clases.Libro;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        Biblioteca biblioteca = new Biblioteca();


        System.out.printf("1- Agregar un nuevo libro\n2- Buscar libro\n3- Ver todos los libros\n");
        int opcion = scanner.nextInt();

        String continuar;
        continuar = "no";
        do {switch (opcion){
            case 1:
                biblioteca.agregarLibro();
                break;
            //case 2:
            //    biblioteca.buscarLibro();
            //    break;
            case 3:
                biblioteca.listarTodos();
                break;
            }

            System.out.printf("Desea continuar (SI/NO)\n");
            continuar = scanner.next();
        }

    }
}