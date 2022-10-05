public class HolaMundo4 {
    public static void main(String args[]) {
        // caracteres especiales
        var nombre = "Denisse";

        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre); // regresa un espacio
        System.out.println("Retroceso: \b\b" + nombre); // regresa dos espacios
        System.out.println("Comilla simple: \'" + nombre + "'"); // la comilla simple no cierra str entonces fue
        System.out.println("Comilla doble: \"" + nombre + "\""); // aca si necesitas backlash
    }
}
