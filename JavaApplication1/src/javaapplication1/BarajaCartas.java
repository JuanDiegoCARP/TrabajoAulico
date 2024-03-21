package javaapplication1;

import java.util.ArrayList;

public class BarajaCartas {
    

 private ArrayList<Cartas> mazo;
 private ArrayList<Cartas> monton;


 
 public void barajar(){
 
     for (Cartas cartas : mazo) {
         for (int i = 1; i < 4; i++) {
             for (int j = 1; j < 10; j++) {
                 if(j!=8||j!=9){
                     switch (i) {
                         case 1:
                             cartas.setNum(j);
                             cartas.setPalo("Basto");
                             
                         break;
                         
                         case 2:
                             cartas.setNum(j);
                             cartas.setPalo("Espada");   
                         
                             break;
                             
                         case 3:           
                             cartas.setNum(j);
                             cartas.setPalo("Copa");
                         
                         break;
                         
                         case 4:
                             cartas.setNum(j);
                             cartas.setPalo("oro");
                             
                      default:
                             
                             
                             
                        
                     }
                 
                 
                 
                 }
                 
             }
             
         }
         
        }
 
     System.out.println(mazo);
 
 
 }
 
 
 
 
 
 
 
}

