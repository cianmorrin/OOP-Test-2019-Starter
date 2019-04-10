package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    public int r;
    public int g;
    public int b;
    public int value;
  

    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b + "\t" + value ;  
    }

    public Colour(TableRow row)
    {
        colour = row.getString("colour");
        r = row.getInt("r");
        g = row.getInt("g");
        b = row.getInt("b");
        value = row.getInt("value");
        
    }

    public Colour()
    {
        
    }

}
