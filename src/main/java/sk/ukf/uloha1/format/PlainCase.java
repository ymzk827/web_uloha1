package sk.ukf.uloha1.format;

import org.springframework.stereotype.Component;

@Component("plain")
public class PlainCase implements MessageFormatter {
    @Override
    public String format(String message) {
        return message;
    }
}