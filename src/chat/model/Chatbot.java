package chat.model;

public class Chatbot 
{
	private String charbotName;
	private String userName;
	
	public Chatbot(String chatbotName)
	{
		this.charbotName = chatbotName;
		this.userName = "";
	} 
	
	public String processText(String input)
	{
		String output = input;
		return output;
	}
	private boolean spookyChecker(String text)
	{
		boolean isSpooky = true;
		
		return isSpooky;
	}
	private String spookyResponse()
	{
		String response = "That was really spooky!";
		
		return response;
	}
	private boolean isValidHTMLChecker(String text)
	{
		boolean isValid = true;
		
		return isValid;
	}
	private String isValidHTMLResponse()
	{
		String response = "This is a valid HTML!";
		return response;
	}
	private String reversePronounDirection(String source)
	{
		String response = "";
		return response;
	}
}
