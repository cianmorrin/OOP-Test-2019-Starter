package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class UI extends PApplet
{
	
	private ArrayList<Colour> colours = new ArrayList<Colour>();
//	private ArrayList<Resistor> resistors = new ArrayList<Resistor>();

	private Colour colour;

	public void loadColours()
      {
          Table table = loadTable("colours.csv", "header");
          for(TableRow tr:table.rows())
          {
              Colour c = new Colour(tr);
              colours.add(c);
          }        
	  }
	  
      public void printColours() {
		for (Colour c : colours) {
			System.out.println(c);
		}
	}


	public Colour findColour(int value){

	for (Colour c : colours) {
			if(c.getValue() == value)
			{
				System.out.println(c);
			}

		}

		return colour;
		
	}


	// public void loadResistors()
    //   {
    //       Table table = loadTable("resistors.csv");
    //       for(TableRow tr : table.rows())
    //       {
    //           Resistor r = new Resistor(tr);
    //           resistors.add(r);
    //       }        
	//   }

	//   public void printResistors()
    //   {
	// 	for (Resistor r : resistors) {
	// 		System.out.println(r);
	// 	}    
	//   }
	  

	

	public void separate(int value)
	{
		int hundreds = (value / 100);
		int tens = (value - (hundreds * 100)) / 10;
		int ones = value - ((hundreds * 100)  + (tens * 10));
		print(hundreds + ",");
		print(tens + ",");
		println(ones);
	}

	public void settings()
	{
		size(500, 800);
		
		separate(381);
		separate(1);
		separate(92);
		
		loadColours();
		printColours();
		findColour(4);

		// loadResistors();
		// printResistors();
		

	}

	public void setup() 
	{

	}
	
	public void draw()
	{			
		
		line(50, 100, 350, 100);
		rect(150, 50, 100, 100 );
		

		line(50, 300, 350, 300);
		rect(150, 250, 100, 100 );

		line(50, 500, 350, 500);
		rect(150, 450, 100, 100 );

		line(50, 700, 350, 700);
		rect(150, 650, 100, 100 );


	}
}
