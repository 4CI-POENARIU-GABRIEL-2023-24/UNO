package model;

public class CartaUno
{
    public enum Colore
    {
        Blu, Rosso, Giallo, Verde, Jolly;
        
        private static final Colore[] colori = Colore.values();
        public static Colore getColore(int i)
        {
            return Colore.colori[i];
        }
    }
    
    public enum Valore
    {
        Zero, Uno, Due, Tre, Quattro, Cinque, Sei, Sette, Otto, Nove,
        CambiaGiro, SaltaGiro, PescaDue, PescaQuattro, CambiaColore;
        
        private static final Valore[] valori = Valore.values();
        public static Valore getValore(int i)
        {
            return Valore.valori[i];
        }
    }
    
    private final Colore colore;
    private final Valore valore;
    
    public CartaUno(final Colore colore, final Valore valore)
    {
        this.colore = colore;
        this.valore = valore;
    }

    public Colore getColore()
    {
        return this.colore;
    }
    public Valore getValore()
    {
        return this.valore;
    }
    
    @Override
    public String toString()
    {
        return this.colore + "_" + this.valore;
    }
}
