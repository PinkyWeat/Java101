import java.util.Scanner;

public class Rectangulo {
    public static void main(String argsp[]) {
        // area y perimetro
        Scanner console = new Scanner(System.in);

        System.out.println("Proporcione el largo: ");
        int largo = Integer.parseInt(console.nextLine());
        System.out.println("Proporcione el ancho: ");
        int ancho = Integer.parseInt(console.nextLine());
        var area = largo * ancho;
        var perimetro = (largo + ancho) * 2;
        System.out.println("area: " + area);
        System.out.println("perimetro: " + perimetro);

    }
}
