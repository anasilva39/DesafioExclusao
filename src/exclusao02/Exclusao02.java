
package exclusao02;

import java.util.Arrays;


public class Exclusao02 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        String v[]= {"ana","paula","bianca","ana","carla","renata","alice","bruna","jessica","bianca","debora","carla","alice","paula","bianca","raquel","renata","julia","bruna","ana"};
        String w[]= removerDuplicados(v);
        System.out.println(Arrays.toString(w));
    }

    private static String[] removerDuplicados(String[] v) {
        int n= v.length;
        String []w = Arrays.copyOf(v, n);
        
        for(int i = 0; i < n; i++){
            int k = i+1;
            int removido = 0;
            for(int j = i+1; j<n; j++){
                if(w[j] == null ? w[i] == null : w[j].equals(w[i])){
                    removido++;
                }else 
                    w[k++] = w[j];
                    
            }
            n= n- removido;
        }
        
        w = Arrays.copyOf(w, n);
        
        return w;
        
    }
    
}
