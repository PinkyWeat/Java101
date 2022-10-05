public class HolaMundo3 {
    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = titulo + " " +  usuario;
        System.out.println("union = " + union);

        var i = 3;
        var j = 4;

        System.out.println(i + j); // addition
        System.out.println(i + j + usuario); // primero hace la suma y luego concatena
        System.out.println(usuario + i + j); // lo toma como cadena por empezar con str
        System.out.println(usuario + (i + j)); // los parentesis tienen preferencia above all
        
    }
}
