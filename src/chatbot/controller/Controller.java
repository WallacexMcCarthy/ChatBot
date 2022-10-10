package chatbot.controller;

import java.util.Scanner;

import chat.model.Chatbot;

import chat.view.Popup;


public class Controller 
{
	private Chatbot chatbot;
	private Popup view;
	
	public Controller()
	{
		this.chatbot = new Chatbot("Super smart chatbot");
		this.view = new Popup();
	}
	public void start()
	{
		String text = view.askQuestion("Lets talk to the chatbot!");
//		System.out.println("Lets talk to the chatbot");
//		String text = keyboardInput.nextLine();
		
		while (!text.equalsIgnoreCase("shutdown"))
		{
			String chatbotResponse = interactWithChatbot(text);
//			System.out.println("Chatbot says: ");
//			System.out.println(charbotResponse);
			
			text = view.askQuestion("Chatbot says: " + chatbotResponse);
		}
		

	}
	
	private String interactWithChatbot(String userText)
	{
		String response = "";
		
		response = chatbot.processText(userText);
		
		return response;
	}
	
}
