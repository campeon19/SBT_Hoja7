
import java.util.*;

public class Controlador{

    OrdenarAlfabeticamente posicion = new OrdenarAlfabeticamente();
    abb arbol = new abb();
    ArrayList<String> lectura;
    ArrayList<String> contenido = new ArrayList<String>();
    ArrayList<String> oracion;
    ArrayList<String> traducido = new ArrayList<String>();
    LectorTXT txt = new LectorTXT();
    


    public void obtenerDiccionario(){

        lectura = txt.leer();
        System.out.println(lectura);

    }

    public void obtenerOracion(){

        oracion = txt.leerOracion();

    }

    public void insertarPalabras(){


        for(int i = 0; i<lectura.size(); i++){

            String separar = lectura.get(i);
            String[] parts = separar.split(",");
            String ingles = parts[0].replace(" ", "");
            String espanol = parts[1].replace(" ", "");
            System.out.println(ingles);
            System.out.println(espanol);
            int pos = posicion.valor(ingles);
            System.out.println(pos);

            arbol.insertar(pos, espanol, ingles);

        }

    }

    public void mostrarInOrder(){

        arbol.inOrder();

    }

    public void mostrarPreOrder(){

        arbol.preOrder();

    }

    public void mostrarPosOrder(){

        arbol.posOrder();

    }

    public void traducirOracion(){

        for(int i = 0; i< oracion.size(); i++){

            
            String palabra = oracion.get(i).replace(" ", "").replace(",", "").replace(".", "");
            int pos = posicion.valor(palabra);
            System.out.println(arbol.existe(pos, palabra));
            if(arbol.existe(pos, palabra) == true){
                System.out.print(arbol.buscar(palabra, pos) + " ");
            }else{
                System.out.print("*" + palabra + "*" + " ");
            }

        }


    }
    

}