package chatbot.controller;

import java.util.Scanner;

import chat.model.Chatbot;


public class Controller 
{
	private Chatbot chatbot;
	private Scanner keyboardInput;
	
	public Controller()
	{
		this.chatbot = new Chatbot("Super smart chatbot");
		this.keyboardInput = new Scanner(System.in);
	}
	public void start()
	{
		System.out.println("Lets talk to the chatbot");
		String text = keyboardInput.nextLine();
		
		while (!text.equalsIgnoreCase("shutdown"))
		{
			String charbotResponse = interactWithChatbot(text);
			System.out.println("Chatbot says: ");
			System.out.println(charbotResponse);
			
			text = keyboardInput.nextLine();
		}
		
		
		keyboardInput.close();
	}
	
	private String interactWithChatbot(String userText)
	{
		String response = "";
		
		response = chatbot.processText(userText);
		
		return response;
	}
	
}
