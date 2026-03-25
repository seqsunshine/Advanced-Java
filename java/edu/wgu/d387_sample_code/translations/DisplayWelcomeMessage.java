package edu.wgu.d387_sample_code.translations;

import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Component
public class DisplayWelcomeMessage {
    private final ExecutorService executor;

    public DisplayWelcomeMessage() {
        this.executor = Executors.newFixedThreadPool(5);
    }

    public String[] getWelcomeMessage(String[] locales) {
        String[] messages = new String[locales.length];

        for (int i = 0; i < locales.length; i++) {
            final int index = i;
            Runnable task = new Runnable() {
                @Override
                public void run() {
                    try {
                    ResourceBundle bundle = ResourceBundle.getBundle("translations", new Locale(locales[index]));
                    messages[index] = bundle.getString("welcome");
                } catch (Exception e) {
                    messages[index] = "Error loading welcome message";
                }
            }
        };
            executor.submit(task);
        }
        executor.shutdown();
        while (!executor.isTerminated()) {

        }
        return messages;
    }
}
