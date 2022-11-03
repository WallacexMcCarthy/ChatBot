package chat.model;

import java.util.ArrayList;

public class Chatbot 
{
	private String charbotName;
	private String userName;
	private ArrayList<String> spookyList;
	private ArrayList<String> christmasList;
	private ArrayList<String> halloweenList;
	private ArrayList<String> valentinesList;
	private ArrayList<String> jokeList;
	private ArrayList<String> funFactList;
	
	private String [] chatTopics;
	
	public Chatbot(String chatbotName)
	{
		this.charbotName = chatbotName;
		this.userName = "";
		this.spookyList = new ArrayList<String>();
		this.christmasList = new ArrayList<String>();
		this.halloweenList = new ArrayList<String>();
		this.valentinesList = new ArrayList<String>();
		this.jokeList = new ArrayList<String>();
		this.funFactList = new ArrayList<String>();
		
		spookyList();
	} 
	private void loadTopics()
	{
		String topicOne = "Do you like spicy food? I do!";
		String topicTwo = "Do you like gummy bears? Sugar is very yummy!";
		String toicThree = "Do you like kittens or puppies better?";
		String topicFour = "Have you seen the video of the octopus escaing?";
		String topicFive = "What is your favorite holiday?";
		String topicSix = "The Sandman is one of my favorite comic books! Waht is your favorite comic book?";
		String topicSeven = "I like to run, do you?";
		String topicEight = "My coding clas uses Java what do you use?";
		String topicNine = "I dont like cany corn, do you like it?";
		String topicTen = "Writing code is hard but fun, what is your opinion on writing code?";
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
	private void jokeList()
	{
		// 15 valeus
		jokeList.add("What’s the best thing about Switzerland?\n"
				+ "I don’t know, but the flag is a big plus.");
		jokeList.add("I invented a new word!\n"
				+ "Plagiarism!");
		jokeList.add("Did you hear about the mathematician who’s afraid of negative numbers?\n"
				+ "He’ll stop at nothing to avoid them.");
		jokeList.add("Why do we tell actors to “break a leg?”\n"
				+ "Because every play has a cast.");
		jokeList.add("Yesterday I saw a guy spill all his Scrabble letters on the road. I asked him, “What’s the word on the street?”\n"
				+ "Once my dog ate all the Scrabble tiles. For days he kept leaving little messages around the house.");
		jokeList.add("I don’t get why Marvel doesn’t use the Hulk to advertise more.\n He’s basically one big Banner.");
		jokeList.add("Which days are the strongest?\n Saturday and Sunday. The rest are weekdays.");
		jokeList.add("Did you know your pupils are the last part to stop working when you die?\n They dilate.");
		jokeList.add("Who were the greenest Presidents in US history?\n The bushes.");
		jokeList.add("My hotel tried to charge me ten dollars extra for air conditioning.\n That wasn’t cool.");
		jokeList.add("It's easy to convince ladies not to eat Tide Pods, but harder to deter gents.");
		jokeList.add("What is the difference between a numerator and a denominator is a short line?\n Only a fraction of people will understand this");
		jokeList.add("I hate it when people say age is only a number. Age is clearly a word.");
		jokeList.add("Someone complimented my parking today! They left a sweet note on my windshield that said “parking fine.”");
		jokeList.add("I'm Buzz Aldrin, second man to step on the moon. Neil before me.");
	}
	private void spookyList()
	{
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
	}
	private void christmasList()
	{
		// 30 values for christmas
		christmasList.add("Advent");
		christmasList.add("advent");
		christmasList.add("Candy");
		christmasList.add("candy");
		christmasList.add("Bells");
		christmasList.add("bells");
		christmasList.add("Cards");
		christmasList.add("cards");
		christmasList.add("Celebrate");
		christmasList.add("celebrate");
		christmasList.add("Ceremonies");
		christmasList.add("ceremonies");
		christmasList.add("Christmas");
		christmasList.add("christmas");
		christmasList.add("cookies");
		christmasList.add("Cookies");
		christmasList.add("Tree");
		christmasList.add("tree");
		christmasList.add("jolly");
		christmasList.add("Jolly");
		christmasList.add("Merry");
		christmasList.add("merry");
		christmasList.add("Gift");
		christmasList.add("gift");
		christmasList.add("Holiday");
		christmasList.add("holiday");
		christmasList.add("Family");
		christmasList.add("family");
	}
	private void halloweenList()
	{
		halloweenList.add("Spooky");
		halloweenList.add("spooky");
		halloweenList.add("Witch");
		halloweenList.add("witch");
		halloweenList.add("Ghost");
		halloweenList.add("ghost");
		halloweenList.add("Pumpkin");
		halloweenList.add("pumpkin");
		halloweenList.add("Spider");
		halloweenList.add("spider");
		halloweenList.add("Zombie");
		halloweenList.add("zombie");
		halloweenList.add("Haunted");
		halloweenList.add("haunted");
		halloweenList.add("Cult");
		halloweenList.add("cult");
		halloweenList.add("Lurking");
		halloweenList.add("lurnking");
		halloweenList.add("Halloween");
		halloweenList.add("halloween");
		halloweenList.add("Clown");
		halloweenList.add("clown");
		halloweenList.add("Vampire");
		halloweenList.add("vampire");
		halloweenList.add("Cat");
		halloweenList.add("cat");
		halloweenList.add("Dark");
		halloweenList.add("dark");
		halloweenList.add("Nightmare");
		halloweenList.add("nightmare");
	}
	private void valentinesList()
	{
		valentinesList.add("Affection");
		valentinesList.add("affection");
		valentinesList.add("Hugs");
		valentinesList.add("hugs");
		valentinesList.add("Girlfriend");
		valentinesList.add("girlfriend");
		valentinesList.add("Boyfriend");
		valentinesList.add("boyfriend");
		valentinesList.add("Love");
		valentinesList.add("love");
	}
	private void funFactList()
	{
		funFactList.add("Steven Spielberg's first sequel, though technically a prequel, as 'Temple of Doom' takes place in 1935, before Raiders of the Lost Ark (1981) taking place in 1936, "
				+ "Indiana Jones and the Last Crusade (1989) in 1938, and Indiana Jones and the Kingdom of the Crystal Skull (2008) in 1957.\n" + "");
		funFactList.add("Rubber bands last longer when refrigerated.");
		funFactList.add("There are 293 ways to make change for a dollar.");
		funFactList.add("The average person's left hand does 56% of the typing (when using the proper position of the hands on the keyboard; Hunting and pecking doesn't count!).");
		funFactList.add("A shark is the only known fish that can blink with both eyes.");
		funFactList.add("\"OMG\" usage can be traced back to 1917.");
		funFactList.add("Most people fall asleep in seven minutes.");
		funFactList.add("A crocodile cannot stick its tongue out.");
		funFactList.add("Ping Pong balls can travel off the paddle at speeds up to 160 km/hr. That's just under 100 mph.");
		funFactList.add("Nutmeg is extremely poisonous if injected intravenously.");
		funFactList.add("A snail can sleep for three years.");
		funFactList.add("Americans, on average, eat 18 acres of pizza every day.");
		funFactList.add("The only domestic animal not mentioned in the Bible is the cat.");
		funFactList.add("Hydrogen gas is the least dense substance in the world, at 0.08988g/cc.");
		funFactList.add("Honey is the only natural food made without destroying any life.");
		funFactList.add("A dentist invented the electric chair.");
	}
	
	private boolean holidayChecker(String text)
	{
		boolean isHoliday = false;
		int christmasInt = 0;
		int halloweenInt = 0;
		int valentinesInt = 0;
		boolean isChristmas = false;
		boolean isHalloween = false;
		boolean isValentines = false;
		for(int index = 0; index < christmasList.size(); index++)
		{
			if (text.contains(christmasList.get(index)))
			{
				isHoliday = true;
				christmasInt += 1;
			}else if (text.contains(halloweenList.get(index)))
			{
				isHoliday = true;
				halloweenInt += 1;
			}else if (text.contains(valentinesList.get(index)))
			{
				isHoliday = true;
				valentinesInt += 1;
			}
		}
		if (christmasInt != 0)
		{
			isChristmas = true;
		}
		if (halloweenInt != 0)
		{
			isHalloween = true;
		}
		if (valentinesInt != 0)
		{
			isValentines = true;
		}
		
		
		return isHoliday;
	}
	private String whatHolidayChecker(String text)
	{
		String whatHoliday = "";
		for(int index = 0; index < christmasList.size(); index++)
		{
			if (text.contains(christmasList.get(index)))
			{
				whatHoliday = "Christmas";
				
			}else if (text.contains(halloweenList.get(index)))
			{
				whatHoliday = "Halloween";
			}else if (text.contains(valentinesList.get(index)))
			{
				whatHoliday = "Valentines Day";
			}
		}
		
		return whatHoliday;
	}
	private String holidayResponse()
	{
		String response = "It is a holiday!";
		
		return response;
	}
	
	private boolean spookyChecker(String text)
	{
		boolean isSpooky = false;
		
		
		for(int index = 0; index < 20; index++)
		{
			if (text.contains(spookyList.get(index)))
			{
				isSpooky = true;
			}
		}
		return isSpooky;
	}
	
	private String tellGroanJoke()
	{
		String groanJoke = "";
		int randomIndex = 0;
		randomIndex = (int) (Math.random()*(jokeList.size()-1));
		groanJoke = jokeList.get(randomIndex);
		return groanJoke; 
	}
	private String tellRandomFact()
	{
		String funFact = "";
		int randomIndex = 0;
		randomIndex = (int) (Math.random()*(funFactList.size()-1));
		funFact = funFactList.get(randomIndex);
		return funFact;
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
		}else
		{
			int openTagStartIndex = text.indexOf("<");
			int openTagEndIndex = text.indexOf(">", openTagStartIndex);
			
			if(openTagStartIndex < openTagEndIndex)
			{
				String keyword = text.substring(openTagStartIndex + 1, openTagEndIndex);
				
				int openTagStart = text.indexOf("<"+ keyword + ">");
				int closeTagStartIndex = text.indexOf("</");
				int closeTagEndIndex = text.indexOf(">", closeTagStartIndex);
				if(closeTagStartIndex > openTagEndIndex && closeTagEndIndex > closeTagStartIndex)
				{
					String closingKeyword = text.substring(closeTagStartIndex + 2, closeTagEndIndex);
					
					int closeTagStart = text.indexOf("<" + closingKeyword + ">", openTagEndIndex);
					int spaceIndex = keyword.indexOf(" ");
					if (spaceIndex != -1)
					{
						keyword = keyword.substring(0, spaceIndex);
					}
					if (keyword.equals(closingKeyword))
					{
						isValid = true;
					}
				}
				
			}
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
	

}
