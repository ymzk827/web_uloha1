package sk.ukf.uloha1.notifications;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sk.ukf.uloha1.format.MessageFormatter;
import sk.ukf.uloha1.NotificationService;

@Component("smsNotification")
public class SmsNotification implements NotificationService {
    private final MessageFormatter messageFormatter;

    public SmsNotification(@Qualifier("plain") MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    @Override
    public String send(String message) {
        String formattedMessage = messageFormatter.format(message);
        return "SMS  sent: " + formattedMessage;
    }
}