//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class MadLib
{
	private ArrayList<String> verbs = new ArrayList<String>();
	private ArrayList<String> nouns = new ArrayList<String>();
	private ArrayList<String> adjectives = new ArrayList<String>();
	private String story = "";

	public MadLib()
	{
		verbs.add("run");
		nouns.add("Johnathon Leohr");
		adjectives.add("purple");
		story = "Johnathon Leohr runs down the purple road.";
	}

	public MadLib(String fileName)
	{
		//load stuff
		

		try
		{
			//Read the different parts of the story and concatenate the resulting
			//story using the symbols to tell you the parts of speech


			//While there is more of the story, read in the word/symbol

				//If what was read in is one of the symbols, find a random
				//word to replace it.
			}


		}
		catch(Exception e)
		{
			System.out.println("Houston we have a problem!");
		}

}

	public void loadNouns()
	{
		//We are adding onto the list array that is already made.
		try
		{
			Scanner nouns = new Scanner(new File("nouns.dat"));
			while(nouns.hasNext())
		{
			System.out.println(nouns.nextLine());
			nounsArray.add(nouns.nextLine());
		}
		nouns.close();
    	}
		
		catch(Exception e)
		{
			System.out.println("nouns.dat does not exist");
		}

	}

	public void loadVerbs()
	{
		String[] verbsArray = new String[];
		try
		{
			Scanner verbs = new Scanner(new File("verbs.dat"));
			while(verbs.hasNext())
		{
			System.out.println(verbs.nextLine());
			verbArray[] = verbs.next();
		}
		verbs.close();
		}
		catch(Exception e)
		{
			System.out.println("verbs.dat does not exist");
		}
	}

	public void loadAdjectives()
	{
		try
		{
			Scanner adjectives = new Scanner(new File("adjectives.dat"));
			while(adjectives.hasNext())
		{
			System.out.println(adjectives.nextLine());
		}
		adjectives.close();
		}
		catch(Exception e)
		{
			System.out.println("adjectives.dat does not exist");
		}
	}

	public String getRandomVerb()
	{
		int x = (int)(Math.random()*13) + 1;

    	System.out.println(x);
		return "" + x;
	}

	public String getRandomNoun()
	{
		return "";
	}

	public String getRandomAdjective()
	{
		return "";
	}

	public String toString()
	{
		return "";
	}
}