import java.util.ArrayList;
import java.util.List;

public class Result {

    public static List<Boolean> podraCumplir(List<Integer> caso){

        int D;
        int T;
        int F;
        int R;
        int resultado;
        List<Boolean> r = new ArrayList<>();
        D=caso.get(0);
        T=caso.get(1);
        F=caso.get(2);
        R=caso.get(3);
        
        resultado=(F-R)*(D-1)+F;
        
        if(resultado<T){
            
            r.add(false);
            
        }
        
        if(resultado>=T){
            r.add(true);
            
        }
        


        return r;
    }
}
