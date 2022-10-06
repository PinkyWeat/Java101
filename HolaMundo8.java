public class HolaMundo8 {
    public static void main(String args[]) {
        /*
                tipos enters del tipo flotante: float (32 bytes) y double (64 bytes).
                puede tener valores mayores a int o long, por guardar en exponenciales.
         */
        float numFloat = 15.0F; // los float por default son double
        // asi que un double de 64bits no se puede almacenar en un float asi nomas.
        float numFloat2 = (float) 4.20; // se le puede agregar la F o poner (float) al principio.
        System.out.println("numFloat2 = " + numFloat2); // le puse 4.20 tho.
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor minimotipo float: " + Float.MIN_VALUE);
        System.out.println("Valor minimotipo float: " + Float.MAX_VALUE);

        float numLoco = (float) 3.4028236E38D;
        System.out.println("numLoco = " + numLoco); // printea Infinity!!!
        
        double numeroDouble = 25;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimotipo double: " + Double.MIN_VALUE);
        System.out.println("Valor minimotipo double: " + Double.MAX_VALUE);
        // es el que guarda los numeros mas mas grandes.

    }
}
