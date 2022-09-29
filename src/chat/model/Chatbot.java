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
}
