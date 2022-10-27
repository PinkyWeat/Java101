public class HolaMundo20 {
    public static void main(String args[]) { // Operadores Ternarios
        // tienen tres partes __ condicion a evaluar ? dependiendo si T : o F el res.

        var resultado = (3 < 2) ? "verdadero" : "falso" ; // ? lo que imprime
        System.out.println("resultado: " + resultado); // simplificar if else

        var numero = 7;
        resultado = (numero % 2 == 0 ? "numero par" : "numero impar");
        System.out.println("Resultado: " + resultado);
    }
}
