public class HolaMundo2 {
    public static void main(String args[]) {
        int entero = 25;
        System.out.println(entero);
        //Modificando el valor de la variable
        entero = 420;
        System.out.println(entero);

        String miString = "Queen Denisse";
        System.out.println(miString);

        miString = "Queen Denisse :D";
        System.out.println(miString);

        //var - Inferencia de tipos en Java
        var entero2 = 7; //poner int seria lo mismo
        System.out.println(entero2);

        var string2 = "Kween Sperence";
        System.out.println("string2 = " + string2);
        System.out.println("miString = " + miString);
    }
}