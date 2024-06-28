package clases;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public void agregarLibro(Libro libro){};
    public Libro buscarLibro(String titulo){};
    public void listarTodos(){};

    public Biblioteca(){
        this.libros = new ArrayList<Libro>();
    }

}
