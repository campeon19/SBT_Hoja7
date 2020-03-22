
import java.util.*;

public class Main{

    public static void main(String[] args) {
        
        Controlador controlador = new Controlador();
        Scanner scan = new Scanner(System.in);
        int opcion1 =0;

        System.out.println("----------Diccionario Ingles-espanol----------");

        System.out.println("\nCargando palabras...");
        controlador.obtenerDiccionario();
        controlador.insertarPalabras();

        while (opcion1 != 5){
            System.out.println("\nQue desea realizar?");
            System.out.println("1. Imprimir diccionario en formato InOrder");
            System.out.println("2. Imprimir diccionario en formato PreOrder");
            System.out.println("3. Imprimir diccionario en formato PosOrder");
            System.out.println("4. Traducir la oracion que esta en el archivo txt, del ingles al espanol");
            System.out.println("5. Salir");

            opcion1 = scan.nextInt();

            switch(opcion1){

                case 1:
                controlador.mostrarInOrder();
                break;

                case 2:
                controlador.mostrarPreOrder();
                break;

                case 3:
                controlador.mostrarPosOrder();
                break;

                case 4:
                controlador.obtenerOracion();
                controlador.traducirOracion();
                break;

                case 5:
                System.out.println("Feliz dia!");
                break;

                default:
                System.out.println("Opcion no valida");
                break;

            }

        }
        
    }

}