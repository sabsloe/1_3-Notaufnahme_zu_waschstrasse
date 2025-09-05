
public class Warteliste
{
    private Knoten anfang;
    private Knoten ende;

    public Warteliste()
    {
        anfang = null;
    }

    public void einfuegen(Patient pat)
    {
        Knoten k = new Knoten(pat);
        if (anfang == null)
        {
            anfang= k;
        }
        else
        {
            ende.setNachfolger(k);    
        }
        ende = k;
    }

    public Patient entfernen()
    {
        Patient p = null; 
        if (anfang != null)
        {
            p = anfang.getInhalt();
            if(anfang == ende)
            {
                anfang = null;
                ende = null;
            }

            else 
            {
                anfang = anfang.getNachfolger();
                
            }
            System.out.println("Enferne " + p.getName());
        }
        
        return p;
    }


}
