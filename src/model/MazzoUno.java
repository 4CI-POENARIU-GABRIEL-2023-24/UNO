package model;

import java.util.ArrayList;
import java.util.Random;

public class MazzoUno
{
    private ArrayList<CartaUno> carte;
    
    public MazzoUno()
    {
        this.carte = new ArrayList<>();
    }
    
    public void reset()
    {
        CartaUno.Colore[] colori = CartaUno.Colore.values();
        CartaUno.Valore[] valori = CartaUno.Valore.values();
        
        for (int numCol = 0; numCol < colori.length-1; numCol++)
        {
            // uno 0 per colore
            CartaUno.Colore colore = colori[numCol];
            carte.add(new CartaUno(colore, valori[0]));
            
            // dall'1 al 9 (2 serie) per colore
            for (int numVal = 1; numVal < 10; numVal++)
            {
                carte.add(new CartaUno(colore, valori[numVal]));
                carte.add(new CartaUno(colore, valori[numVal]));
            }
            
            // Cambia Giro, Salta Giro e Pesca Due (2 serie) per colore
            for (int numVal = 10; numVal < 13; numVal++)
            {
                carte.add(new CartaUno(colore, valori[numVal]));
                carte.add(new CartaUno(colore, valori[numVal]));
            }
        }
        
        // 4 Pesca Quattro e Cambia Colore
        for (int numVal = 13; numVal < 15; numVal++)
        {
            for (int i = 0; i < 4; i++)
            {
                carte.add(new CartaUno(colori[4], valori[numVal]));   
            } 
        }
    }
    
    public void mescola()
    {
        Random rand = new Random();
        
        for (int i = 0; i < this.carte.size(); i++)
        {
            int posizione = rand.nextInt(this.carte.size());
            CartaUno temp = this.carte.get(posizione);
            this.carte.set(posizione, this.carte.get(i));
            this.carte.set(i, temp);
        }
    }

    public void addCarta(CartaUno carta)
    {
        CartaUno copiaCarta = new CartaUno(carta.getColore(), carta.getValore());
        this.carte.add(copiaCarta);
    }
    
    public CartaUno prendiCartaCasuale()
    {
        Random rand = new Random();
        int posizione = rand.nextInt(this.carte.size());
        CartaUno carta = this.carte.get(posizione);
        this.carte.remove(posizione);
        CartaUno copiaCarta = new CartaUno(carta.getColore(), carta.getValore());
        return copiaCarta;
    }
    
    public CartaUno prendiCartaCasualeNormale()
    {
        Random rand = new Random();
        int posizione = rand.nextInt(this.carte.size());
        CartaUno carta = this.carte.get(posizione);
        
        String colore = carta.toString().split("_")[0];
        String valore = carta.toString().split("_")[1];
        
        while (colore.equals("Jolly") || valore.equals("CambiaGiro") || valore.equals("SaltaGiro") || valore.equals("PescaDue"))
        {        
            posizione = rand.nextInt(this.carte.size());
            carta = this.carte.get(posizione);
            colore = carta.toString().split("_")[0];
            valore = carta.toString().split("_")[1];
        }
        this.carte.remove(posizione);
        CartaUno copiaCarta = new CartaUno(carta.getColore(), carta.getValore());
        return copiaCarta;
    }
    
    public int getSize()
    {
        return this.carte.size();
    }
    
    public void setCarte(ArrayList<CartaUno> carte)
    {
        this.carte.clear();
        for (CartaUno c : carte)
        {
            this.carte.add(new CartaUno(c.getColore(), c.getValore()));
        }
    }
    
    public ArrayList<CartaUno> getCarte()
    {
        ArrayList<CartaUno> copiaCarte = new ArrayList<>();
        for (CartaUno c : this.carte)
        {
            copiaCarte.add(new CartaUno(c.getColore(), c.getValore()));
        }
        return copiaCarte;
    }
    
    public CartaUno getCarta(int posizione)
    {
        CartaUno copiaCarta = new CartaUno(carte.get(posizione).getColore(), carte.get(posizione).getValore());
        return copiaCarta;
    }
    
    public void removeCarta(int posizione)
    {
        carte.remove(posizione);
    }
    
    @Override
    public String toString()
    {
        String out = this.getSize() + "";
        for (CartaUno c : this.carte)
        {
            out += "\n" + c.toString();
        }
        return out;
    }
}
