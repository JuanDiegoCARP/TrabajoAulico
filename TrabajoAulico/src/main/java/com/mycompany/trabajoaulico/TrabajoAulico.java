package com.mycompany.trabajoaulico;

import java.util.HashMap;
import java.util.Map;

public class TrabajoAulico {
    public static void main(String[] args) {
        Baraja baraja = new Baraja();
        
        try{
            baraja.barajar();
            baraja.mostrarBaraja();
            baraja.cartasMonton();
        }catch(Exception e){
            System.out.println(e);
        }
        
        /*HashMap<String,Integer> cartas = new HashMap();
        
        barajar()
        cartas.put("Copa", 12);
        for (Map.Entry i : cartas.entrySet()) {
            for (int j = 0; j < 36; j++) {
                cartas.put("Copa", j+1);
            }
        }*/
    }
}
