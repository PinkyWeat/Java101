import java.util.Scanner;

public class EjercicioCalificaciones {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);

        System.out.println("Proporcione un valor entre 0 y 10: ");
        var numero = Integer.parseInt(console.nextLine());
        var numeroTexto = "Numero Texto";
        
        if (numero == 9 || numero == 10)
            numeroTexto = "A";
        else if (numero < 9 && numero > 7)
            numeroTexto = "B";
        else if (numero < 8 && numero > 6)
            numeroTexto = "C";
        else if (numero < 7 && numero == 6)
            numeroTexto = "D";
        else if (numero >= 0 && numero <= 6)
            numeroTexto = "F";
        else
            System.out.println("Valor Desconocido");
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
