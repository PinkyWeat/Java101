public class EstructuraIfElse2 {
    public static void main(String argsp[]) {
        var condicion = true;

        if (condicion) {
            System.out.println("Verdadera");
        } else {
            System.out.println("Falso");
        } // al ser una linea podria ser sin las {-}

        var numero = 2;
        var numeroTexto = "Numero desconocido";

        if (numero == 1) {
            numeroTexto = "Numero uno";
        } else if (numero == 2){
            numeroTexto = "Numero dos";
        } else {
            numeroTexto = "Ninguno";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
