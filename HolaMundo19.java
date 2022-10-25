public class HolaMundo19 {
    public static void main(String args[]) { // Operadores Condicionales and y or
        var a = 7;
        var valorMinimo = 0;
        var valorMaximo = 10;

        var resultado = a >= valorMinimo && a <= valorMaximo; // estamos viendo si esta dentro de un rango
        if (resultado) {
            System.out.println("Dentro del rango");
        } else {
            System.out.println("Fuera del rango");
        }

        // algoritmo para or
        // cuAndo el padre puede ir a el partido: diasDescanso OR vacaciones
        var vacaciones = true;
        var diaDescanso = false;
        var padrePuede = vacaciones || diaDescanso; // una true - resultado true.

        if (padrePuede) {
            System.out.println("Puede asistir");
        } else {
            System.out.println("El padre esta ocupado");
        }
    }
}
