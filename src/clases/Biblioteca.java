package clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Libro> libros;

    public Biblioteca(){
        this.libros = new ArrayList<Libro>();
    }

    public void agregarLibro(){
        System.out.printf("Ingrese el titulo del libro\n");
        String titulo = scanner.nextLine();

        System.out.printf("Ingrese el autor del libro\n");
        String autor = scanner.nextLine();

        System.out.printf("Ingrese la cantidad de paginas\n");
        Integer cantPag = scanner.nextInt();

        Libro nuevoLibro = new Libro(titulo,autor,cantPag);

        libros.add(nuevoLibro);
    }

    //public Libro buscarLibro(String titulo){
    // };

    public void listarTodos(){
        libros.forEach(libro -> System.out.println(libro));
    };



}
