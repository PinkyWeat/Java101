public class HolaMundo15 {
    public static void main(String args[]) { // Operadores de asignacion
        int a = 3, b = 2;
        int c = a + 5 - b; // las evaluaciones se dan de izq a der | + y - mismo lvl | = 6
        System.out.println("Valor c = " + c);

        a += 1; // a = a + 1
        System.out.println("Valor a = " + a);

        a += 3; // con - * y % funca too
        System.out.println("Valor a =  " + a);
        a -= 2;
        System.out.println("Valor a = " + a);
        a *= 3;
        System.out.println("Valor a = " + a);
        a %= 2;
        System.out.println("Valor a = " + a);
    }
}
