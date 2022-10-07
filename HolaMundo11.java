public class HolaMundo11 {
    public static void main(String args[]) {
        boolean varBool = false;
        // valores de tipo bandera.
        System.out.println("varBool = " + varBool);

        if (varBool) {
            System.out.println("La bandera es verdadera");
        }
        else if (!varBool) {
            System.out.println("La bandera es falsa");
        }

        var edad = 10;
        var esAdulto = edad >= 18; // sabe que es boolean xq eso devuelve t or f

        if (esAdulto) {
            System.out.println("Eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad");
        }




    }
}
