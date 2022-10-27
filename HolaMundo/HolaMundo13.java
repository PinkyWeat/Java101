import java.util.Scanner;


public class HolaMundo13 {
    public static void main(String args[]) {
        // Conversion de Tipos en Java
        // string a entero y viceversa
        var edad = Integer.parseInt("20"); // recibe string y devuelve int
        System.out.println("edad = " + (edad + 1));

        var edad1 = "20";
        System.out.println("(edad1 + 1) = " + (edad1 + 1)); // concatena

        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        System.out.println("(valorPI) + 1 = " + (valorPI) + 1); // retorna 3.14161

        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        // esto nos cambia de int a string.

        var consola = new Scanner(System.in);

        // un caracter de una cadena
        var caracter = "hola"; // solo almacena un char la char, aca se puso str.
        var caracter2 = "hola".charAt(0); // es un objeto ya el string.
        // tiene indice tambien si le ponemos 0 regresa h.
        System.out.println("caracter2 = " + caracter2); // es un char!
        caracter2 = consola.nextLine().charAt(0); // le pedimos un char y si escribe string igual
        System.out.println("caracter2 = " + caracter2); // devuelve solo el primer char.
    }
}
