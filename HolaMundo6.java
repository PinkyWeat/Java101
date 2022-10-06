public class HolaMundo6 {
    public static void main(String args[]) {
        // tipos primitivos Enteros o Flotantes
        // hoy solo Enteros: byte, short, int, long

        byte numByte = 25; // si le pones 129 salta error
        System.out.println("valor min numByte = " + Byte.MIN_VALUE); // -128
        System.out.println("valor max numByte = " + Byte.MAX_VALUE); // 128

        byte numByte2 = (byte) 129; // el (byte) transforma y obliga a que sea byte
        System.out.println("Valor byte ahora: " + numByte2);
    }
}
