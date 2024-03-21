package com.mycompany.trabajoaulico;

import java.util.ArrayList;

public class Baraja {
    private ArrayList<Cartas> cartas = new ArrayList();
    private ArrayList<Cartas> mazo = new ArrayList();

    public Baraja() {}
    
    public void barajar(){
        for(Cartas c : cartas) {
            for(int i = 0; i < 4; i++) {
                for (int j = 0; j < 12; j++) {
                    switch (i) {
                        case 0 -> {
                            c.setNumero(j + 1);
                            c.setPalo("Basto");
                        }
                        case 1 -> {
                            c.setNumero(j + 1);
                            c.setPalo("Copa");
                        }
                        case 2 -> {
                            c.setNumero(j + 1);
                            c.setPalo("Espada");
                        }
                        case 3 -> {
                            c.setNumero(j + 1);
                            c.setPalo("Oro");
                        }
                    }
                }
            }
        }
    }
    public void siguienteCarta(){
        if(!cartas.isEmpty()){
            System.out.println(cartas.get(0));
        }
    }
    public void cartasDisponibles(){
        for(int i = 0; i < 36; i++) {
            if(cartas.contains(mazo)){
                
            }
        }
    }
    public void darCartas(){
        
    }
    public void cartasMonton(){
        if(!mazo.isEmpty()){
            System.out.println(mazo);
        }else{
            System.out.println("No hay cartas en el mazo.");
        }
    }
    public void mostrarBaraja(){
        if(!cartas.isEmpty()){
            System.out.println(cartas);
        }else{
            System.out.println("No quedan cartas en la baraja.");
        }
    }
}
