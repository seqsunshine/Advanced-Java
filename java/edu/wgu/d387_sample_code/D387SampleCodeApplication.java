package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.translations.DisplayWelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class D387SampleCodeApplication {
	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);
		DisplayWelcomeMessage displayWelcomeMessage = new DisplayWelcomeMessage();

		String[] locales = {"en_US", "fr_CA"};

		try{
			String[] messages = displayWelcomeMessage.getWelcomeMessage(locales);

			for (String message : messages) {
				System.out.println(message);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
