package Loops;

public class GoTo {
    public static void main(String args[]) {
        inicio:
        for (var contador = 0; contador < 3; contador++) {
            if (contador % 2 == 0) {
                continue inicio;  // lo que hace es volver a donde pusiste la etiqueta.
                // dice que no esta bueno irl, pero es importante conocer esta sintaxis.
                // tambien se usa en el break el inicio.
            }
        }
    }
}
