package sk.ukf.uloha1.format;

import org.springframework.stereotype.Component;

@Component("upper")
public class UpperCase implements MessageFormatter {
    @Override
    public String format(String message) {
        return message.toUpperCase();
    }
}