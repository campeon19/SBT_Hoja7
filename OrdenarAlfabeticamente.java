

public class OrdenarAlfabeticamente{

    char[] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};


    public OrdenarAlfabeticamente(){

        /*int index = 0;
        for (char c = 'a'; c <= 'z'; c++) {
            abecedario[index++] = c;
        }*/

    }

    public int valor(String palabra){

        String x = palabra.toLowerCase();
        int pos = 0;

        for(int i = 0; i<abecedario.length;i++){
            if(x.charAt(0) == abecedario[i]){
                pos = i+1;
            }
        }

        return pos;

    }

    public int valor2(String palabra){
        String x = palabra.toLowerCase();
        int pos = 0;

        for(int i = 0; i<abecedario.length;i++){
            if(x.charAt(1) == abecedario[i]){
                pos = i+1;
            }
        }

        return pos;
    }

    public int valor3(String palabra){

        String x = palabra.toLowerCase();
        int pos = 0;

        for(int i = 0; i<abecedario.length;i++){
            if(x.charAt(2) == abecedario[i]){
                pos = i+1;
            }
        }

        return pos;
    }
    

}