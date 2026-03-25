package edu.wgu.d387_sample_code.timezones;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("api/timezones")
public class TimeController {

    private final TimeConvertor timeConvertor;

    public TimeController(TimeConvertor timeConvertor) {
        this.timeConvertor = timeConvertor;
    }

    @GetMapping("/presentation")
    public String[] convertTime() {
        LocalDateTime currentTime = LocalDateTime.now();

        return timeConvertor.convertTime(currentTime);
    }

}
