package ch.noseryoung.nosifier.businessobject.notification;

import ch.noseryoung.nosifier.businessobject.notification.dto.NotificationDTO;
import ch.noseryoung.nosifier.service.sender.messenger.email.Mail;
import ch.noseryoung.nosifier.service.sender.messenger.email.MailConfig;
import ch.noseryoung.nosifier.service.sender.messenger.email.MailProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceImpl implements NotificationService {

    private final MailProps mailProps;

    @Autowired
    public NotificationServiceImpl(MailProps mailProps){
        this.mailProps = mailProps;
    }

    @Override
    public void sendMail(Notification notification) {
        MailConfig mailConfig = new MailConfig(mailProps);
        Mail mail = new Mail(mailConfig.getIMAP(), mailConfig.getSMTP(), mailProps);
        mail.send("mateusz.dettlaff0@gmail.com", notification);
    }
}
