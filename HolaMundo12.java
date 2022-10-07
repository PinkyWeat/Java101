import java.util.Scanner;


public class HolaMundo12 {
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

        // Pedir un valor
        var consola = new Scanner(System.in);
        System.out.println("Proporciona tu edad: ");
        edad = Integer.parseInt(consola.nextLine()); // si no le pones un entero te tira.
        System.out.println("edad = " + edad); // una exception pero no vimos eso aun.
    }
}
