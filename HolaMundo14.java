public class HolaMundo14 {
    public static void main(String args[]) {
         int a=3, b=2;
         var resultado = a + b;
        System.out.println("resultado suma = " + resultado);

        resultado = a - b;
        System.out.println("resultado resta = " + resultado);

        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3.0 / b; // 3.0 es float y = lo mismo que 3D o 3F
        System.out.println("resultado division = " + resultado2); // literal de punto floante
                                        // tipo flotante = . decimal
                                        // tipo float = variable en Java

        resultado = a % b; // devolvera un entero
        System.out.println("resultado modulo = " + resultado);

        // es par o impar?
        if (b % 2 == 0) // basicamente preguntamos "es igual lo que esta a la derecha que a la izquierda?"
            System.out.println("Es numero par!");
        else
            System.out.println("Es numero impar!");
    }
}
