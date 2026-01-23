
//Import line for using new Random
import java.util.Random;
//You need these to access files
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class RandomStuff {

    public static void main (String[] args) throws IOException
    {
    	//Math.random version
		//produces a random number from 1 to 50
    	int x = (int)(Math.random()*50) + 1;

    	System.out.println(x);

    	//new Random version
		//creates a random object, but you have to use a method call to access it.
    	Random rand = new Random();
    	int y = rand.nextInt(50) + 1;

    	System.out.println(y);

		Scanner reader = new Scanner(new File("nouns.dat"));
		
		while(reader.hasNext())
		{
			System.out.println(reader.nextLine());
		}
		reader.close();
    }
	

}