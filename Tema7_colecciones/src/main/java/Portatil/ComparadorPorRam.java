
package Portatil;
//  treeset o treemap si o si tengo que utilizar comparable
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ComparadorPorRam implements Comparator<Portatil> {

    @Override
    public int compare(Portatil portatil1, Portatil portatil2) {
        return Integer.compare(portatil1.getRam(), portatil2.getRam());


    }
}
