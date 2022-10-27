public class HolaMundo21 {
    public static void main(String args[]) { // Precedencia Operadores
        // orden en que se los evalua || Prioridades || Imagen en README.md
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x = " + x);
        System.out.println("y = " + y); // aca hizo el decremento
        System.out.println("Valor z: " + z);
        // primero los ++ y --

        var resultado = 4 + 5 * 6 / 3; // 4 + ((5*6) / 3) **1
        // usamos parentesis para cambiar la prioridad, sino no es necesario.
        // de hecho aca**1 es redundante. Pero para entender.
        // el + separo los terminos para realizar las operaciones
        // luego multiplicas por izq der, y luego dividir por este mismo principio
        System.out.println("Resultado: " + resultado);

        resultado = (4 + 5) * 6 / 3; // modificamos la prioridad con los (-)
        System.out.println("resultado = " + resultado);
    }
}
