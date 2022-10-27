public class EstacionIfElse {
    public static void main(String args[]) {
        var mes = 1;
        var estacion = "desconocida";
        
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Vereano";
        } else {
            estacion = "Otono";
        }
        System.out.println("estacion = " + estacion);
    }
}
