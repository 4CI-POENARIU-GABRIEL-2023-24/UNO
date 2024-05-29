package controller;

import model.*;
import view.*;
import java.util.ArrayList;

public class Controller
{
    private ArrayList<String> giocatori;
    private int turno;
    private boolean cambioDirezione;
    
    private MazzoUno mazzoPesca;
    private ArrayList<MazzoUno> mazziGiocatori;
    private CartaUno cartaScarto;
    
    private int numCarteDaPescare;
    private String coloreJolly;
    
    public Controller()
    {
        giocatori = new ArrayList<>();
        new Menu(this).setVisible(true);
    }
    
    public ArrayList<String> getGiocatori()
    {
        ArrayList<String> copiaGiocatori = new ArrayList<>();
        for (String s : giocatori)
        {
            copiaGiocatori.add(s);
        }
        return copiaGiocatori;
    }
    
    public void addGiocatore(String g)
    {
        giocatori.add(g);
    }
    
    public String getCartaScarto()
    {
        return cartaScarto.toString();
    }
    
    public ArrayList<ArrayList<String>> getMazziGiocatori()
    {
        ArrayList<ArrayList<String>> copiaMazziGiocatori = new ArrayList<>();
        ArrayList<String> copiaMazzoGiocatore = new ArrayList<>();
        for (MazzoUno mazzo : this.mazziGiocatori)
        {
            for (CartaUno carta : mazzo.getCarte())
            {
                copiaMazzoGiocatore.add(carta.toString());
            }
            copiaMazziGiocatori.add(copiaMazzoGiocatore);
            copiaMazzoGiocatore = new ArrayList<>();
        }
        return copiaMazziGiocatori;
    }
    
    public int getTurno()
    {
        return turno;
    }
    
    public String getColoreJolly()
    {
        return coloreJolly;
    }
    
    public int getNumCarteDaPescare()
    {
        return numCarteDaPescare;
    }
    
    public void setColoreJolly(String coloreJolly)
    {
        this.coloreJolly = coloreJolly;
    }
    
    public boolean sonoCompatibili(String cartaMazzo, String cartaScarto)
    {
        String[] colori = new String[2];
        String[] valori = new String[2];
        
        colori[0] = cartaMazzo.split("_")[0];
        colori[1] = cartaScarto.split("_")[0];
        valori[0] = cartaMazzo.split("_")[1];
        valori[1] = cartaScarto.split("_")[1];
        
        if (valori[0].equals("PescaDue"))
        {
            if (valori[1].equals("PescaDue")) return true;
            else if (valori[1].equals("CambiaGiro") || valori[1].equals("SaltaGiro"))
            {
                return colori[0].equals(colori[1]);
            }
            else if (valori[1].equals("PescaQuattro"))
            {
                return colori[0].equals(coloreJolly);
            }
            else if (valori[1].equals("CambiaColore"))
            {
                return colori[0].equals(coloreJolly);
            }
            else
            {
                return colori[0].equals(colori[1]);
            }
        }
        else if (valori[0].equals("CambiaGiro"))
        {
            if (valori[1].equals("PescaDue"))
            {
                if (numCarteDaPescare != 0) return false;
                else return colori[0].equals(colori[1]);
            }
            else if (valori[1].equals("CambiaGiro")) return true;
            else if (valori[1].equals("SaltaGiro"))
            {
                return colori[0].equals(colori[1]);
            }
            else if (valori[1].equals("PescaQuattro"))
            {
                if (numCarteDaPescare != 0) return false;
                else return colori[0].equals(coloreJolly);
            }
            else if (valori[1].equals("CambiaColore"))
            {
                return colori[0].equals(coloreJolly);
            }
            else
            {
                return colori[0].equals(colori[1]);
            }
        }
        else if (valori[0].equals("SaltaGiro"))
        {
            if (valori[1].equals("PescaDue"))
            {
                if (numCarteDaPescare != 0) return false;
                else return colori[0].equals(colori[1]);
            }
            else if (valori[1].equals("CambiaGiro"))
            {
                return colori[0].equals(colori[1]);
            }
            else if (valori[1].equals("SaltaGiro")) return true;
            else if (valori[1].equals("PescaQuattro"))
            {
                if (numCarteDaPescare != 0) return false;
                else return colori[0].equals(coloreJolly);
            }
            else if (valori[1].equals("CambiaColore"))
            {
                return colori[0].equals(coloreJolly);
            }
            else
            {
                return colori[0].equals(colori[1]);
            }
        }
        else if (valori[0].equals("PescaQuattro")) return true;
        else if (valori[0].equals("CambiaColore"))
        {
            if (valori[1].equals("PescaDue") || valori[1].equals("PescaQuattro"))
            {
                if (numCarteDaPescare != 0) return false;
                else return true;
            }
            else return true;
        }
        else {
            if (valori[1].equals("PescaDue"))
            {
                if (numCarteDaPescare != 0) return false;
                else return colori[0].equals(colori[1]);
            }
            else if (valori[1].equals("CambiaGiro") || valori[1].equals("SaltaGiro"))
            {
                return colori[0].equals(colori[1]);
            }
            else if (valori[1].equals("PescaQuattro"))
            {
                if (numCarteDaPescare != 0) return false;
                else return colori[0].equals(coloreJolly);
            }
            else if (valori[1].equals("CambiaColore"))
            {
                return colori[0].equals(coloreJolly);
            }
            else
            {
                return colori[0].equals(colori[1]) || valori[0].equals(valori[1]);
            }
        }
    }
    
    public void startGioco()
    {
        turno = 0;
        cambioDirezione = false;
        mazzoPesca = new MazzoUno();
        mazzoPesca.reset();
        
        mazziGiocatori = new ArrayList<>();
        for (int i = 0; i < giocatori.size(); i++)
        {
            MazzoUno mazzo = new MazzoUno();
            for (int j = 0; j < 7; j++)
            {
                CartaUno carta = mazzoPesca.prendiCartaCasuale();
                mazzo.addCarta(carta);
            }
            mazziGiocatori.add(mazzo);
        }
        cartaScarto = mazzoPesca.prendiCartaCasualeNormale();

        numCarteDaPescare = 0;
        coloreJolly = "";
        
        new FinestraGioco(this).setVisible(true);
    }
    
    public boolean scartaCarta(int posizione)
    {
        CartaUno cartaDaScartare = mazziGiocatori.get(turno).getCarta(posizione);
        
        mazziGiocatori.get(turno).removeCarta(posizione);
        if (mazziGiocatori.get(turno).getSize() == 0)
        {
            vittoria();
            return false;
        }
        mazzoPesca.addCarta(cartaScarto);
        cartaScarto = cartaDaScartare;
        if (!coloreJolly.equals("")) coloreJolly = "";
        
        CartaUno.Valore[] valori = CartaUno.Valore.values();
        if (cartaDaScartare.getValore() == valori[10]) cambioDirezione = !cambioDirezione;
        if (cartaDaScartare.getValore() == valori[12])
        {
            numCarteDaPescare += 2;
        }
        if (cartaDaScartare.getValore() == valori[13])
        {
            numCarteDaPescare += 4;
            new ColoreJolly(this).setVisible(true);
        }
        if (cartaDaScartare.getValore() == valori[14]) new ColoreJolly(this).setVisible(true);
        
        if (!cambioDirezione)
        {
            if (cartaDaScartare.getValore() != valori[11])
            {
                if (turno + 1 < giocatori.size()) turno++;
                else turno = 0;
            } else
            {
                if (turno + 2 < giocatori.size()) turno += 2;
                else if (turno == giocatori.size() - 2) turno = 0;
                else if (turno == giocatori.size() - 1) turno = 1;
            }
        }
        else 
        {
            if (cartaDaScartare.getValore() != valori[11])
            {
                if (turno - 1 >= 0) turno--;
                else turno = giocatori.size() - 1;
            } else
            {
                if (turno - 2 >= 0) turno -= 2;
                else if (turno == 1) turno = giocatori.size() - 1;
                else if (turno == 0) turno = giocatori.size() - 2;
            }
        }
        return true;
    }
    
    public void prossimoTurno()
    {
        if (!cambioDirezione)
        {
            if (turno + 1 < giocatori.size()) turno++;
            else turno = 0;
        }
        else 
        {
            if (turno - 1 >= 0) turno--;
            else turno = giocatori.size() - 1;
        }
    }
    
    public String pescaCarta()
    {
        if (mazzoPesca.getSize() == 0) mazzoPesca.reset();
        CartaUno cartaPescata = mazzoPesca.prendiCartaCasuale();
        mazziGiocatori.get(turno).addCarta(cartaPescata);
        return cartaPescata.toString();
    }
    
    public void pescaCarte()
    {
        if (mazzoPesca.getSize() == 0) mazzoPesca.reset();
        for (int i = 0; i < numCarteDaPescare; i++)
        {
            CartaUno cartaPescata = mazzoPesca.prendiCartaCasuale();
            mazziGiocatori.get(turno).addCarta(cartaPescata);
        }
        numCarteDaPescare = 0;
    }
    
    public void vittoria()
    {
        new Vittoria(this, giocatori.get(turno)).setVisible(true);
    }
    
    @Override
    public String toString()
    {
        String out = "";
        out += giocatori.toString() + "\n";
        out += turno + "\n";
        out += cambioDirezione + "\n";
        out += mazzoPesca.toString() + "\n";
        out += mazziGiocatori.toString() + "\n";
        out += cartaScarto.toString();
        return out;
    }
}
