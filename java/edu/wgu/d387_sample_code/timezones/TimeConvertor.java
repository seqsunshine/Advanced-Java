package edu.wgu.d387_sample_code.timezones;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Component
public class TimeConvertor {

    public String[] convertTime(LocalDateTime inputTime) {
        ZoneId easternZone = ZoneId.of("America/New_York");
        ZoneId mountainZone = ZoneId.of("America/Denver");
        ZoneId universalZone = ZoneId.of("UTC");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm z");

        String easternTime = inputTime.atZone(easternZone).format(formatter);
        String mountainTime = inputTime.atZone(easternZone).withZoneSameInstant(mountainZone).format(formatter);
        String universalTime = inputTime.atZone(easternZone).withZoneSameInstant(universalZone).format(formatter);

        return new String[] { easternTime, mountainTime, universalTime };

    }
}
