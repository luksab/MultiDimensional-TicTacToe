import java.util.*;
public class Feld
{
    private ArrayList<Integer> Koord = new ArrayList<Integer>();
    private int spieler;
    private int reihe;

    public Feld(ArrayList<Integer> NKoord,int spielerNeu)
    {
        Koord = NKoord;
        spieler=spielerNeu;
    }

    public Feld(ArrayList<Integer> NKoord)
    {
        Koord = NKoord;
    }

    public Feld(int a,int b,int c, int d)
    {
        Koord = new ArrayList<Integer>();
        Koord.add(a);
        Koord.add(b);     
        Koord.add(c);  
        Koord.add(d);
    }
    
    public Feld()
    {
        Koord = new ArrayList<Integer>();
    }

    public Feld(int Nreihe,ArrayList<Integer> NKoord)
    {
        Koord = NKoord;
        reihe = Nreihe;
    }

    public ArrayList getK()
    {
        return Koord;
    }

    public int gC(int a){
        return Koord.get(a);
    }

    public int gR(){
        return reihe;
    }

    public int spieler()
    {
        return spieler;
    }

    public int getSpieler()
    {
        return spieler;
    }

    public void setSpieler(int NSpieler)
    {
        spieler = NSpieler;
    }

    public void setReihe(int Nreihe)
    {
        reihe = Nreihe;
    }

    public String toString(){
        String s = ""+"Spieler: "+spieler+" Koordinaten: ";
        if(Koord.size()>0){
            for(int i=0;i<Koord.size()-1;i++){
                s += +Koord.get(i)+"|";
            }
            s += +Koord.get(Koord.size()-1);
        }
        return s;
    }
}
