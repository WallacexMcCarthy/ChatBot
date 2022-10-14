package chat.model;

import java.util.ArrayList;

public class Chatbot 
{
	private String charbotName;
	private String userName;
	private ArrayList<String> spookyList;
	
	public Chatbot(String chatbotName)
	{
		this.charbotName = chatbotName;
		this.userName = "";
		this.spookyList = new ArrayList<String>();
	} 
	
	public String processText(String input)
	{
		String output = reversePronounDirection(input);
		
		if (spookyChecker(input))
		{
			output += "\n" + spookyResponse() + "\n";
		}
		
		if (isValidHTMLChecker(input))
		{
			output += "\n" + isValidHTMLResponse() + "\n";
		}else 
		{
			output += "\n" + "No HTML here :( " + "\n";
		}
		
		return output;
	}
	private boolean spookyChecker(String text)
	{
		boolean isSpooky = false;
		
		spookyList.add("Spooky");
		spookyList.add("spooky");
		spookyList.add("Witch");
		spookyList.add("witch");
		spookyList.add("Ghost");
		spookyList.add("ghost");
		spookyList.add("Pumpkin");
		spookyList.add("pumpkin");
		spookyList.add("Spider");
		spookyList.add("spider");
		spookyList.add("Zombie");
		spookyList.add("zombie");
		spookyList.add("Haunted");
		spookyList.add("haunted");
		spookyList.add("Cult");
		spookyList.add("cult");
		spookyList.add("Bones");
		spookyList.add("bones");
		spookyList.add("Lurking");
		spookyList.add("lurking");
		
		for(int index = 0; index < 20; index++)
		{
			if (text.contains(spookyList.get(index)))
			{
				isSpooky = true;
			}
		}
		return isSpooky;
	}
	private String spookyResponse()
	{
		String response = "That was really spooky!";
		
		return response;
	}
	private boolean isValidHTMLChecker(String text)
	{
		boolean isValid = false;
		
		if (text.indexOf("<") == -1 || text.indexOf(">") == -1)
		{
			return isValid;
		}
		
		return isValid;
	}
	private String isValidHTMLResponse()
	{
		String response = "This is a valid HTML!";
		return response;
	}
	private String reversePronounDirection(String source)
	{
		String response = source.replace("I ", "You ");
		response = response.replace("you", "me");
		response = response.replace(" am ", " are ");
		return response;
	}
	
	private boolean holidayChecker(String input)
	{
		boolean isChristmas = false;
		return isChristmas;
	}
	private String holidayResponse()
	{
		String response = "It is a holiday!";
		
		return response;
	}
}
