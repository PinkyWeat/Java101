public class HolaMundo16 {
    public static void  main(String args[]) { // Operadores Unarios
        // operador de cambio de signo
        var a = 3;
        var b = -a;
        System.out.println("a: " + a + " b: " + b);

        // operador de negacion | boolean
        var c = true; // inicializar true booleano
        var d = !c; // de true a false
        System.out.println("c " +  c + " d: " + d);

        // operador de incremento y decremento
        //1.preincremento (simbolo antes de la variable)
        var e = 3;
        var f = ++e; // primero se aumenta la variable y luego se utiliza su valor
        // primero se full aumenta e. o sea e = 4 | Y despues se asigna 4 a f !!!
        System.out.println("e: " + e + " f: " + f);

        //2.posincremento (simbolo despues de la variable)
        var g = 5;
        var h = g++;
        // primero se utiliza el valor y luego se incrementa.
        // se incrementa la proxima vez que se vaya a usar, no necesariamente cuando paso eso.
        System.out.println("g: " + g + " h: " + h); // aca se incremento g en realidad

        // decremento
        var i = 2;
        var j = --i;
        System.out.println("i: " + i + " j: " + j);

        var k = 4;
        var l = k--;
        System.out.println("k: " + k + " l: " + l); // quedaba pendiente el decremento, y aca sucede
    }
}
