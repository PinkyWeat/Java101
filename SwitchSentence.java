public class SwitchSentence {
    public static void main(String args[]) {
         var numero = 10;
         var numeroTexto = "Valor desconocido";

         switch (numero) {
             case 1:
                 numeroTexto = "Numero uno";
                 break;
             case 2:
                 numeroTexto = "Numero dos";
                 break;
             case 3:
                 numeroTexto = "Numero tres";
                 break;
             case 4:
                 numeroTexto = "Numero cuatro";
             default:
                 numeroTexto = "default // no necesaria";
         }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}
