package ch.noseryoung.nosifier.service.sender.messenger.email;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Configuration
@Component
public class MailConfig {

    private final MailProps mailProperties;

    public MailConfig(MailProps mailProperties) {
        this.mailProperties = mailProperties;
    }

    @Bean
    @Qualifier("smtpProps")
    public Properties getSMTP() {
        Properties properties = new Properties();
        properties.setProperty("mail.smtp.host", mailProperties.getSmtp());
        properties.setProperty("mail.smtp.port", "" + mailProperties.getPort());
        properties.setProperty("mail.smtp.auth", "true");
        properties.setProperty("mail.smtp.starttls.enable", "true");

        return properties;
    }

    @Bean
    @Qualifier("imapProps")
    public Properties getIMAP() {

        Properties props = new Properties();
        props.setProperty("mail.store.protocol", "imaps");

        return props;
    }
}
