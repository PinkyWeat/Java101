import java.util.Scanner;

public class MayorDe {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        System.out.println("Proporcione el numero1: ");
        int numero1 = Integer.parseInt(console.nextLine());
        System.out.println("Proporcione el numero2: ");
        int numero2 = Integer.parseInt(console.nextLine());

        var resultado = numero1 > numero2 ? "El numero mayor es " + numero1 : "El numero mayor es: " + numero2;
        System.out.println("resultado: " + resultado);

    }
}
