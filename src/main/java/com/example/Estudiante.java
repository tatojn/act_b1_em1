package com.example;

public class Estudiante {
    // TODO: Declarar atributos privados para nombre, edad y promedio
    private String nombre;
    private int edad;
    private double promedio;

    // TODO: Crear constructor que reciba nombre, edad y promedio como parámetros
    public Estudiante(String nombre, int edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;

    }

    // TODO: Implementar métodos getter para cada atributo
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    // TODO: Implementar métodos setter para cada atributo
    // Nota: En el setter de edad, validar que sea mayor o igual a 0
    // Nota: En el setter de promedio, validar que esté entre 0.0 y 10.0
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("La edad no puede ser negativa.");
        }
    }

    public void setPromedio(double promedio) {
        if (promedio >= 0.0 && promedio <= 10.0) {
            this.promedio = promedio;
        } else {
            System.out.println("El promedio debe estar entre 0.0 y 10.0.");
        }
    }

    // TODO: Crear método mostrarInformacion que imprima los datos del estudiante

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Promedio: $" + promedio);
    }
}
