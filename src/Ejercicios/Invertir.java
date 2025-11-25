package Ejercicios;

// Invertir cadena de manera recursiva
public class Invertir {

    public static String invertirRecursivo(String s, int ind){
        if(ind == s.length()){
            return "";
        }
        return invertirRecursivo(s, ind+1)+s.charAt(ind);
    }

    public static String invertirIterativo(String s){
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

}
