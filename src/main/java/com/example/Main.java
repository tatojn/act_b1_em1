package com.example;

public class Main {
    public static void main(String[] args) {

        // TODO: Crear método main para:
        // 1. Crear dos objetos Estudiante con diferentes valores
        // 2. Mostrar la información de ambos estudiantes
        // 3. Modificar algún atributo usando un setter
        // 4. Mostrar la información actualizada
        Estudiante estudiante1 = new Estudiante("Juan", 20, 8.5);
        Estudiante estudiante2 = new Estudiante("Ana", 22, 9.0);
        estudiante1.mostrarInformacion();
        estudiante2.mostrarInformacion();
        estudiante1.setEdad(21);
        estudiante1.mostrarInformacion();
        estudiante2.setPromedio(9.5);
        estudiante2.mostrarInformacion();

        // TODO: Crear método main para:
        // 1. Crear un libro usando el constructor completo
        // 2. Crear un libro usando el constructor con solo titulo y autor
        // 3. Mostrar información de ambos libros
        // 4. Aplicar descuento usando ambas versiones del método
        // 5. Mostrar información actualizada de los libros
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 39.99);
        Libro libro2 = new Libro("El amor en los tiempos del cólera", "Gabriel García Márqez");

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

        libro1.aplicarDescuento(10.0);
        libro1.aplicarDescuento(15.0, 25.0);
        System.out.println("Después de aplicar descuentos:");
        libro2.aplicarDescuento(15.0);
        libro2.aplicarDescuento(20.0, 25.0);
        System.out.println("Después de aplicar descuentos:");

        libro1.mostrarInformacion();
        libro2.mostrarInformacion();

    }
}