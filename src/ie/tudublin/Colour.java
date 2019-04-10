package ie.tudublin;

import processing.data.TableRow;

public class Colour
{
    private String colour;
    public int r;
    public int g;
    public int b;
  

    public String toString()
    {
        return colour + "\t" + r + "\t" + g + "\t" + b ;  
    }

    public Colour(TableRow row)
    {
        colour = row.getString("Display Name");
        r = row.getInt("Hab?");
        g = row.getInt("Xg");
        b = row.getInt("Yg");
        
    }

    public Colour()
    {
        
    }

}
