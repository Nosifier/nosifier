package ch.noseryoung.nosifier.service.sender.messenger.email;

import ch.noseryoung.nosifier.businessobject.notification.Notification;
import ch.noseryoung.nosifier.businessobject.notification.dto.NotificationDTO;
import ch.noseryoung.nosifier.service.sender.Channel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.Properties;

public class Mail implements Channel {
    private final Properties imapProperties;
    private final Properties smtpProperties;
    private final MailProps mailProperties;

    @Autowired
    public Mail(@Qualifier("imapProps") Properties imapProperties, @Qualifier("smtpProps") Properties smtpProperties, MailProps mailProperties) {
        this.imapProperties = imapProperties;
        this.smtpProperties = smtpProperties;
        this.mailProperties = mailProperties;
    }

    @Override
    public void send(String receiverID, Notification notification) {

        try {
            Session session = Session.getDefaultInstance(smtpProperties);

            Transport transport = session.getTransport("smtp");
            transport.connect(mailProperties.getSmtp(), mailProperties.getUser(), mailProperties.getPassword());

            Message mimeMessage = new MimeMessage(session);
            InternetAddress[] address = {new InternetAddress(receiverID)};
            mimeMessage.setRecipients(Message.RecipientType.TO, address);
            mimeMessage.setFrom(new InternetAddress(mailProperties.getUser(), mailProperties.getDisplayedName()));
            mimeMessage.setSubject(notification.getTitle());
            mimeMessage.setContent(notification.getContent(), "text/html; charset=UTF-8");
            mimeMessage.saveChanges();
            transport.sendMessage(mimeMessage, address);

            transport.close();

        } catch (MessagingException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
