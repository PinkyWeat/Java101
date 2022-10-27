import java.util.Scanner;

public class EstacionSwitch {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        var estacion = "Estacion desconocida";

        System.out.println("Proporcione mes: ");
        int mes = Integer.parseInt(console.nextLine());
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otono";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
