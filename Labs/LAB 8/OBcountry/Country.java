package OBcountry;

public class Country 
{
    String countryname;
    int population;
    
    Country(String countryname, int i)
    {
        this.countryname = countryname;
        this.population = i;
    }
    Country()
    {
        this.countryname = "no name";
        this.population = 0;
    }
    public String toString()
    {
        return countryname + " " + population;
    }
}

