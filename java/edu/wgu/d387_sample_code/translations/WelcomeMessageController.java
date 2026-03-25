package edu.wgu.d387_sample_code.translations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/translations")
public class WelcomeMessageController {

    private final DisplayWelcomeMessage displayWelcomeMessage;

    @Autowired
    public WelcomeMessageController(DisplayWelcomeMessage displayWelcomeMessage) {
        this.displayWelcomeMessage = displayWelcomeMessage;
    }

    @GetMapping("/welcome")
    public String[] getWelcomeMessage() {
        String[] locales = {"en_US", "fr_CA"};

        return displayWelcomeMessage.getWelcomeMessage(locales);
    }
}
