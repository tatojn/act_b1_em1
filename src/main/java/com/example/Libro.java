package com.example;

public class Libro {
  // TODO: Declarar atributos privados para titulo, autor y precio
  private String titulo;
  private String autor;
  private double precio;

  // TODO: Crear constructor con todos los atributos (titulo, autor, precio)
  public Libro(String titulo, String autor, double precio) {
    this.titulo = titulo;
    this.autor = autor;
    this.precio = precio;

  }

  // TODO: Crear constructor con solo titulo y autor (precio = 0.0)
  public Libro(String titulo, String autor) {
    this.titulo = titulo;
    this.autor = autor;
    this.precio = 0.0;
  }

  // TODO: Implementar métodos getter para cada atributo
  public String getTitulo() {
    return titulo;
  }

  public String getAutor() {
    return autor;
  }

  public double getPrecio() {
    return precio;
  }

  // TODO: Implementar métodos setter para cada atributo
  // Nota: Validar que el precio no sea negativo
  public void setNombre(String titulo) {
    this.titulo = titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setPrecio(double precio) {
    if (precio >= 0) {
      this.precio = precio;
    } else {
      System.out.println("El precio no puede ser negativo.");
    }
  }

  // TODO: Crear método aplicarDescuento que reciba porcentaje
  // Nota: Calcular descuento y actualizar precio
  public void aplicarDescuento(double porcentaje) {
    if (porcentaje > 0 && porcentaje <= 100) {
      double descuento = precio * (porcentaje / 100);
      precio -= descuento;
    } else {
      System.out.println("Porcentaje inválido.");
    }
  }

  // TODO: Crear método aplicarDescuento que reciba porcentaje y monto máximo
  // Nota: Aplicar descuento solo si no excede el monto máximo
  public void aplicarDescuento(double porcentaje, double montoMaximo) {
    if (porcentaje > 0 && porcentaje <= 100) {
      double descuento = precio * (porcentaje / 100);
      if (descuento <= montoMaximo) {
        precio -= descuento;
      } else {
        System.out.println("El descuento excede el monto máximo permitido.");
      }
    } else {
      System.out.println("Porcentaje inválido.");
    }
  }

  // TODO: Crear método mostrarInformacion que imprima los datos del libro
  public void mostrarInformacion() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("Precio: $" + precio);
  }

}
