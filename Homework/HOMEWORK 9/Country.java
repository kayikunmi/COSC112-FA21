

public class Country
{
    String name;
    int code;
    String iso;
    
    Country(){}
    Country(String name, int code, String iso)
    {
        this.name = name;
        this.code = code;
        this.iso = iso;
        
    }
    public String toString(){
        return "country " + name + " has a code " + code + ", ISO " + iso;
    }

}