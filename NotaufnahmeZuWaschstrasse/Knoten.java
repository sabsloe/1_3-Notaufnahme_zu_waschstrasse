
public class Knoten
{
    private Knoten nachfolger;
    private Patient inhalt;
    
    public Knoten(Patient inhalt_)
    {
        inhalt = inhalt_;
    }
    
    public void setNachfolger(Knoten k)
    {
        nachfolger = k;
    }
    
    public Knoten getNachfolger()
    {
        return nachfolger;
    }
    
    public Patient getInhalt()
    {
        return inhalt;
    }
}