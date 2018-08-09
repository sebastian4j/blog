package com.sebastian.jig;

/**
 * aplicación demo utilizando modulos
 * 
 * compilacion:
 * javac -d target/classes ./src/main/java/**.java
 *
 * crear jar:
 * jar --create --file target/salida.jar --main-class com.sebastian.jig.JigApp -C target/classes .
 *
 * lanzar el modulo:
 * java --module-path target/salida.jar --module jigapp
 *
 * crear un propio jre en jig-jre:
 * jlink --module-path target/salida.jar --add-modules jigapp --compress=2 --output jig-jre
 *
 */
public class JigApp {
  public static void main(final String[] args) {
    System.out.println("Hola Mundo!!");
  }
}
