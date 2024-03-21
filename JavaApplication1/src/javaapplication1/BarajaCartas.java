package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;

public class BarajaCartas {
    

 private ArrayList<Cartas> mazo = new ArrayList<>();
 private ArrayList<Cartas> monton = new ArrayList<>();

public BarajaCartas(){
        for (int i = 1; i < 5; i++) {
        for (int j = 1; j < 13; j++) {
        if(j!=8&&j!=9){
        switch (i) {
                         case 1:
                           Cartas bastos = new Cartas(j, "basto");
                             mazo.add(bastos);
                         break;
                         
                         case 2:
                            Cartas espadas = new Cartas(j, "espada");
                             mazo.add(espadas); 
                         
                             break;
                             
                         case 3:           
                           Cartas copas = new Cartas(j, "copa");
                           mazo.add(copas);
                         
                         break;
                         
                         case 4:
                          Cartas oros = new Cartas(j,"oro");
                          mazo.add(oros);
                             
                          default:
                             
                        }}}}
    System.out.println(mazo.size());
}




public void barajar(){

Collections.shuffle(mazo);
        
System.out.println(mazo);
         }

public Cartas siguienteCarta(){
    
   
}

    
}
