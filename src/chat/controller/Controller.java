package chat.controller;

import java.util.Scanner;

import chat.model.Chatbot;

import chat.view.Popup;

// null pointer exception is when you are trying to do something on a null value, like getting the length of a null value string
/* helper methods are all the methods that help the program do wht it needs to do, and they primarly halpe one method do something 
 that it needs to do. in this example, all otehr methods help the process test method so all of those other methods are helper methods. 
 */

public class Controller 
{
	private Chatbot chatbot;
	private Popup view;
	
	public Controller()
	{
		this.chatbot = new Chatbot("Super smart chatbot"); // using the new keyword to initialize
		this.view = new Popup(); // an overlaoded contructor means to have a class with multiple methods that are called the same thing but have different parameters.
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
