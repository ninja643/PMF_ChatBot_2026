package rs.ac.ni.pmf.chatbot;

import dev.langchain4j.model.chat.ChatModel;
import dev.langchain4j.model.ollama.OllamaChatModel;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
	public static void main(final String[] args)
	{
		final ChatModel model = OllamaChatModel.builder()
				.baseUrl("http://localhost:11434")
				.modelName("qwen2.5:3b")
				.logRequests(true)
				.logResponses(true)
				.temperature(0.2)
				.build();

		System.out.println(model.chat("Hello, how are you?"));
		System.out.println(model.chat("Please tell me a joke?"));
	}
}
