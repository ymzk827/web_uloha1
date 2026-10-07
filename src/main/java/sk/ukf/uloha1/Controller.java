package sk.ukf.uloha1;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private final NotificationService emailService;
    private final NotificationService smsService;
    private final NotificationService pushService;

    public Controller(
            @Qualifier("emailNotification") NotificationService emailService,
            @Qualifier("smsNotification") NotificationService smsService,
            @Qualifier("pushNotification") NotificationService pushService) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.pushService = pushService;
    }

    @GetMapping("/notify/email")
    public String sendEmailNotification() {
        return emailService.send("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in lacus urna. Morbi rutrum vehicula lorem vel imperdiet. Integer dapibus id tellus suscipit dictum. Nullam.");
    }

    @GetMapping("/notify/sms")
    public String sendSmsNotification() {
        return smsService.send("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in lacus urna. Morbi rutrum vehicula lorem vel imperdiet. Integer dapibus id tellus suscipit dictum. Nullam.");
    }

    @GetMapping("/notify/push")
    public String sendPushNotification() {
        return pushService.send("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Donec in lacus urna. Morbi rutrum vehicula lorem vel imperdiet. Integer dapibus id tellus suscipit dictum. Nullam.");
    }
}