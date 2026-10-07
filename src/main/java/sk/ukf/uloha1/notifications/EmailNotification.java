package sk.ukf.uloha1.notifications;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import sk.ukf.uloha1.format.MessageFormatter;
import sk.ukf.uloha1.NotificationService;

@Component("emailNotification")
public class EmailNotification implements NotificationService {
    private final MessageFormatter messageFormatter;

    public EmailNotification(@Qualifier("html") MessageFormatter messageFormatter) {
        this.messageFormatter = messageFormatter;
    }

    @Override
    public String send(String message) {
        String formattedMessage = messageFormatter.format(message);
        return "E-mail sent: " + formattedMessage;
    }
}