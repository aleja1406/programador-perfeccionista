import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Integer> caso= new ArrayList<>();

        caso.add(5);
        caso.add(110);
        caso.add(30);
        caso.add(10);

        List<Boolean> re=Result.podraCumplir(caso);

        System.out.println(re);




    }

}
