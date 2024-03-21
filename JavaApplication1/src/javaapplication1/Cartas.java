package javaapplication1;
public class Cartas {
    
   
    private int Num;
    private String palo;

    public Cartas(int Num, String palo) {
        this.Num = Num;
        this.palo = palo;
        
    }

    public void setNum(int Num) {
        this.Num = Num;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }
    
    
    
    

    public int getNum() {
        return Num;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return Num+" "+palo;
    }
    
    
    
    
}
    
    
    
