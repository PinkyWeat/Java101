public class HolaMundo18 {
    public static void main(String args[]) { // operadores relacionales
        // a <= b etc
        var a = 3;
        var b = 2;

        var g = a >= b; // mayor que && igual a
        System.out.println("g: " + g);

        if (a % 2 == 0) { // operador de igualdad ==
            System.out.println("Es numero par");
        } else {
            System.out.println("Es numero impar");
        }

        var edad = 2;
        var adulto = 18;
        if (edad >= adulto) {
            System.out.println("Es un adulto");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
