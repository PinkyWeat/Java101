import java.util.Scanner;

public class tiendaLibros {
    public static void main(String args[]) {
        // Se solicita info en una tienda de libros:

        var console = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = console.nextLine();
        System.out.println("Proporciona el id: ");
        var id = Integer.parseInt(console.nextLine());
        System.out.println("Proporciona el precio: ");
        var precio = Double.parseDouble(console.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        var envioGratuito = Boolean.parseBoolean(console.nextLine());

        System.out.println(nombre + " #" + id);
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }
}
