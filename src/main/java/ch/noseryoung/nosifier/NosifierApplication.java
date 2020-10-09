package ch.noseryoung.nosifier;

import ch.noseryoung.nosifier.businessobject.notification.dto.NotificationDTO;
import ch.noseryoung.nosifier.service.sender.messenger.email.Mail;
import ch.noseryoung.nosifier.service.sender.messenger.email.MailConfig;
import ch.noseryoung.nosifier.service.sender.messenger.email.MailProps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class NosifierApplication {

	public static void main(String[] args) {
		SpringApplication.run(NosifierApplication.class, args);
	}

}
