import java.util.Scanner;

public class Libro {
    public static void  main(String args[]) {
        Scanner console = new Scanner(System.in);

        System.out.println("Proporciona el titulo: ");
        var titulo = console.nextLine();
        System.out.println("Proporciona el autor: ");
        var autor = console.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
