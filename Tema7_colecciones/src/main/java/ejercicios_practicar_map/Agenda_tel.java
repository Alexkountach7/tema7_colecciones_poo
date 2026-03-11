package ejercicios_practicar_map;

import java.util.HashMap;
import java.util.Map;

public class Agenda_tel {
    static void main() {
        Map<String, Integer> mapamovil = new HashMap<>();
        mapamovil.put("alex",62558416);
        mapamovil.put("sergio",69854723);
        mapamovil.put("pablo", 669524862);

        System.out.println(mapamovil.get("alex"));

       if (!mapamovil.containsKey("alex")){
           System.out.println("el contacto no esta en la lista");
       }else{
           System.out.println("se encuentra en la lista");
       }

       for (String clave : mapamovil.keySet()){
           System.out.println(clave);
       }
    }
}
