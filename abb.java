
/*
*
*
*   basado en el codigo que se encuentra en: https://www.lawebdelprogramador.com/codigo/Java/2257-Arboles-binarios-de-busqueda.html
*/
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class abb {
 
    OrdenarAlfabeticamente od = new OrdenarAlfabeticamente();

    private class nodoArbol {
        private abb hd;
        private abb hi;
        private String espanol;
        private String ingles;
        private int posicion;
 
        private void nodoArbol(){
            hd = null;
            hi = null;
            espanol = "";
            ingles = "";
            posicion = 0;
        }
    }
 
    public nodoArbol raiz;
 
    public void abb(){
        nodoArbol raiz = new nodoArbol();
    }
 
    public boolean esVacio(){
        return (raiz == null);
    }
 
    public void insertar(int a, String es, String in){
        char c1 = in.charAt(0);
        char c2 = in.charAt(1);
        char c3 = in.charAt(2);
        if (esVacio()) {
            nodoArbol nuevo = new nodoArbol();
            nuevo.posicion = a;
            nuevo.espanol = es;
            nuevo.ingles = in;
            nuevo.hd = new abb();
            nuevo.hi = new abb();
            raiz = nuevo;
        }
        else{
            List<String> x = new LinkedList<String>();
            x.add(raiz.ingles);
            x.add(in);
            Collections.sort(x);

            if(x.get(0).equalsIgnoreCase(raiz.ingles)){
                (raiz.hi).insertar(a, es, in);
            }else{
                (raiz.hd).insertar(a, es, in);
            }

            /*if (a > raiz.posicion) {
                (raiz.hd).insertar(a,es,in);
            }
            if (a < raiz.posicion){
                (raiz.hi).insertar(a,es,in);
            }*/
               
        }
    }
 
    public void preOrder(){
        if (!esVacio()) {
            System.out.print( "(" + raiz.ingles + ", " + raiz.espanol + ")" + ", " );
            raiz.hi.preOrder();
            raiz.hd.preOrder();
        }
    }
 
    public void inOrder(){
        if (!esVacio()) {
            raiz.hi.inOrder();
            System.out.print(  "(" + raiz.ingles + ", " + raiz.espanol + ")" + ", "  );
            raiz.hd.inOrder();
        }
    }
 
    public void posOrder(){
        if (!esVacio()) {
            raiz.hd.posOrder();
            raiz.hi.posOrder();
            System.out.print(  "(" + raiz.ingles + ", " + raiz.espanol + ")" + ", "   );
 
        }
    }
 
    public abb buscar(String in, int a){
        abb arbolito = null;
        if (!esVacio()) {
            if (raiz.ingles.equalsIgnoreCase(in)) {
            return this;
            }
            else {
                if (a < raiz.posicion) {
                    arbolito = raiz.hi.buscar(in, a);
                }
                else {
                    arbolito = raiz.hd.buscar(in, a);
                }
            }
        }
        return arbolito;
    }
 
    public boolean existe(int a, String in){
    if (!esVacio()) {
            if (raiz.ingles.equalsIgnoreCase(in)) {
            return true;
            }
            else {
                /*List<String> x = new LinkedList<String>();
                x.add(raiz.ingles);
                x.add(in);
                Collections.sort(x);
                if(x.get(0).equalsIgnoreCase(raiz.ingles)){
                    raiz.hd.existe(a, in);
                }else{
                    raiz.hi.existe(a, in);
                }*/

                if (a < raiz.posicion) {
                    raiz.hi.existe(a, in);
                }
                else {
                    raiz.hd.existe(a, in);
                }
            }
        }
        return false;
    }
 
}