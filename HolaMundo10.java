public class HolaMundo10 {
    public static void main(String args[]) {
        // char class
        char miChar = 'c';
        System.out.println("miChar = " + miChar); // list unicode - 143,859 char en total
        // char es un short || short unicamente decimales y char puede chars y decimales.

        char varChar = '\u0021'; // "nnn" significa que le asignaremos un unicode
        System.out.println("varChar = " + varChar); // signo de admiracion xdxd
                                            // inferencia de tipo es esto o.o
        
        char varCharDecimal = 33; // signo de admiracion xd
        System.out.println("varCharDecimal = " + varCharDecimal);
        char varSimple = '!';
        System.out.println("varSimple = " + varSimple);

        var varCharChar = 'f';
        System.out.println("varCharChar = " + varCharChar); // inferira el valor de la literal
        // var = 33 va a agarrar 33 por el tipo de inferencia que hace
        // si se puede poner:
        var varC = '\u0021';
        System.out.println("varC = " + varC);
        
        // un tipo char puede pasar a int
        int variableEnteraSimbolo = '!';
        System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        // aca lo va a printear como 33.
        // lo podes guardar pero te printea un entero.
        int chaRR = 'a';
        System.out.println("chaRR = " + chaRR);
        // funca casi igual a la ASCII y C
    }
}
