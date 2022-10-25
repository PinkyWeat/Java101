public class HolaMundo17 {
    public static void main(String args[]) { // operadores de igualdad & relacionales
        var a = 3;
        var b = 2;

        var c = (a == b);
        System.out.println("resultado a == b: " + c);

        var d = a != b;
        System.out.println("resultado a != b: " + d);

        var cadena = "hola";
        var cadena2 = "adios";
        var e = cadena == cadena2; // compara referencias de objeto!!
        System.out.println("resultado cadena == cadena2 : " + e);

        var f = !cadena.equals(cadena2); // checkea contenido
        System.out.println("with equals: " + f);
    }
}
