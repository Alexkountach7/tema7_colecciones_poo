package iteradores.Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class mapas_it {
    static void main() {
        HashMap<String, Integer> goleador = new HashMap<>();
        goleador.put("andre silva", 6);
        goleador.put("ronaldo nazario",156);

        Iterator<Map.Entry<String,Integer>> itmapita = goleador.entrySet().iterator();

        while (itmapita.hasNext()){
            Map.Entry<String,Integer> goleadorgol = itmapita.next();
            System.out.println(goleadorgol.getKey()+ " ha marcado "+goleadorgol.getValue());

            if (goleadorgol.getValue()<100){
                itmapita.remove();
            }
        }

        System.out.println(goleador.entrySet());
    }
}
