public class HolaMundo7 {
    public static void main(String args[]) {

        short numShort = 25;
        System.out.println("numShort = " + numShort);

        System.out.println("Max value Short: " + Short.MAX_VALUE);
        System.out.println("Max value Short: " + Short.MIN_VALUE);

        int numInt = 25;
        System.out.println("numInt = " + numInt);
        System.out.println("Max value Int: " + Integer.MAX_VALUE);
        System.out.println("Max value Int: " + Integer.MIN_VALUE);
        // con int si se buguea si le pones un numero mayor a su maximo.
        // se usa la variable tipo long
        int numIntL = (int) 2147483648L; // asi si
        System.out.println("numIntL = " + numIntL);

        long numLong = 29; // para el long en lugar de poner L le pondrias F de Float o D de Double.
        System.out.println("Max value Long: " + Long.MAX_VALUE);
        System.out.println("Max value Long: " + Long.MIN_VALUE);
        System.out.println("numLong = " + numLong);
    }
}
