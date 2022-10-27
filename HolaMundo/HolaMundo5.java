import java.util.Scanner;

public class HolaMundo5 {
    public static void main(String args[]) {
        System.out.println("Escribe tu nombre: ");
        Scanner consola = new Scanner(System.in); // lee lo que pones en consola

        var usuario = consola.nextLine(); // para al programa hasta que le escribas algo

        System.out.println("usuario = " + usuario);

        System.out.println("Escriba el titulo: ");
        var titulo = consola.nextLine();
        System.out.println("Resultado: " + titulo + " " + usuario);
    }
}
